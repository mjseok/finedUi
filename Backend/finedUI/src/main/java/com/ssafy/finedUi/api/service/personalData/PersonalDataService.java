package com.ssafy.finedUi.api.service.personalData;

import com.ssafy.finedUi.api.dto.personalData.PersonalDataRequestDto;
import com.ssafy.finedUi.api.dto.personalData.PersonalDataResponseDto;

public interface PersonalDataService {
    void save(PersonalDataRequestDto personalDataRequestDto);

    PersonalDataResponseDto findById(Long id);


}
