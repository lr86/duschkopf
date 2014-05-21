/*
 * Copyright (C) 2014 Lucas Reeh <lreeh@tugraz.at>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package at.tugraz.eegs.demonativejavaapp;

import at.tugraz.eegs.demonativejavaapp.business.Auto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas Reeh <lreeh@tugraz.at>
 */
public class App {

  public static void main(String[] args) {

    List<Auto> autos = new ArrayList<Auto>();

    Auto auto1 = new Auto();
    auto1.setMarke("Audi");
    auto1.setName("A4");

    Auto auto2 = new Auto();
    auto2.setMarke("Volkswagen");
    auto2.setName("T4");

    autos.add(auto1);
    autos.add(auto2);

    System.out.println("Autos Loop");

    for (Auto dasAuto : autos) {
      dasAuto.printName();
    }

  }
}
