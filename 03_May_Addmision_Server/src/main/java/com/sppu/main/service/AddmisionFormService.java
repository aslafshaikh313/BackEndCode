package com.sppu.main.service;

import com.sppu.main.model.AddmisonForm;

public interface AddmisionFormService {

	AddmisonForm save(AddmisonForm a);

	Iterable<AddmisonForm> getData();

	AddmisonForm updateData(AddmisonForm a, int i);

	String deleteData(int i);

}
