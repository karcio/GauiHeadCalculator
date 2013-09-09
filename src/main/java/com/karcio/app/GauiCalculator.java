package com.karcio.app;

import java.util.Scanner;

/**
 * GauiHeadCalculator ver. 0.1
 * 
 * The application for the calculation of main head rotation for helicopters
 * GAUI 425/550 - Console version
 * 
 * Copyright (C) 2012 by Karol Czarnecki <kczarnecki@hotmail.com>
 * 
 * GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007 This program is free
 * software: you can redistribute it and/or modify it under the terms of the GNU
 * General Public License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>
 */

public class GauiCalculator {

	public static void main(String[] args) {
		final double CELL_VOLTAGE = 3.70;

		Scanner in = new Scanner(System.in);

		System.out
				.print("Calculate main head rotation in your helicopter Gaui 425/550 \n");

		System.out.printf("\nMotor pinion [T]: ");
		int motorPinion = in.nextInt();

		System.out.printf("Front gear [T]: ");
		int frontGear = in.nextInt();

		System.out.printf("One Way Bearing Gear[T]: ");
		int oneWayBearingGear = in.nextInt();

		System.out.printf("Rear gear [T]: ");
		int rearGear = in.nextInt();

		System.out.printf("Number of cells [T]: ");
		int numberOfCells = in.nextInt();

		System.out.printf("Motor KV [T]: ");
		int motorKv = in.nextInt();

		double voltage;
		voltage = numberOfCells * CELL_VOLTAGE;
		System.out.printf("\nVoltage: %.2f", voltage);

		double engineSpeed;
		engineSpeed = motorKv * voltage;
		System.out.printf("\nEngine speed: %.0f", engineSpeed);

		double mainHeadRotation1;
		mainHeadRotation1 = frontGear * rearGear / oneWayBearingGear
				/ motorPinion;

		double mainHeadRotation2;
		mainHeadRotation2 = engineSpeed / mainHeadRotation1;

		System.out.printf("\nMain Head Rotation: %.0f", mainHeadRotation2);

	}

}
