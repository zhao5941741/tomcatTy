package net.bestjade.ty.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.bestjade.ty.entity.Test;
import net.bestjade.ty.mapper.TestMapper;
import org.springframework.stereotype.Service;

@Service
public class TestService extends ServiceImpl<TestMapper, Test> {

}
