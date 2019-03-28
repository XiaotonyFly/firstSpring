package cn.xxy.demo.di;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * spring 注入集合
 * Created by xuxiaoyu on 2019/3/28.
 */
public class DiJavaCollection {

    private List cityList;
    private Set provinceSet;
    private Map countryMap;
    private Properties propPhone;

    public List getCityList() {
        System.out.println("注入的list ：" + cityList);
        return cityList;
    }

    public void setCityList(List cityList) {
        this.cityList = cityList;
    }

    public Set getProvinceSet() {
        System.out.println("注入的set : " + provinceSet);
        return provinceSet;
    }

    public void setProvinceSet(Set provinceSet) {
        this.provinceSet = provinceSet;
    }

    public Map getCountryMap() {
        System.out.println("注入的map : " + countryMap);
        return countryMap;
    }

    public void setCountryMap(Map countryMap) {
        this.countryMap = countryMap;
    }

    public Properties getPropPhone() {
        System.out.println("注入的prop : " + propPhone);
        return propPhone;
    }

    public void setPropPhone(Properties propPhone) {
        this.propPhone = propPhone;
    }
}
