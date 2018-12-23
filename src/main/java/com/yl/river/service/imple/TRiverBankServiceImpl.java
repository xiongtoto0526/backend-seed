package com.yl.river.service.imple;

import com.yl.river.mapper.TRiverBankMapper;
import com.yl.river.model.TRiverBank;
import com.yl.river.service.TRiverBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TRiverBankServiceImpl implements TRiverBankService {

    @Autowired
    TRiverBankMapper tRiverBankMapper;

    @Override
    public List<TRiverBank> getRivers() {
        return tRiverBankMapper.selectAll();
    }
}
