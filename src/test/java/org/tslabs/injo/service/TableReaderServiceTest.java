/* ===========================================================================
 * Copyright (c) 2021 TS Labs. All rights reserved.
 * ===========================================================================
 *
 * Author: statar
 * Created: 4/27/2021  10:02 PM
 */

package org.tslabs.injo.service;


import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.tslabs.injo.model.Department;
import org.tslabs.injo.model.Employee;
import org.tslabs.injo.service.TableReaderService;

import java.util.List;

public class TableReaderServiceTest{
    TableReaderService trs = new TableReaderService();

    public TableReaderServiceTest(){}

    @BeforeEach
    public void setUp() {
    }

    @Test
    public void readTableDataForEmployee() {
        List employees = trs.readTableDataFor(Employee.class);
        Assert.assertNotNull(employees);
        Assert.assertTrue(employees.size() > 1);
    }

    @Test
    public void readTableDataForDepartment() {
        List employees = trs.readTableDataFor(Department.class);
        Assert.assertNotNull(employees);
        Assert.assertTrue(employees.size() > 1);
    }

}