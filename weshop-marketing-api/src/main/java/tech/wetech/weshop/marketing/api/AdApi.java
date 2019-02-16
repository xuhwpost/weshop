package tech.wetech.weshop.marketing.api;

import org.springframework.cloud.openfeign.FeignClient;
import tech.wetech.weshop.api.Api;
import tech.wetech.weshop.marketing.po.Ad;

@FeignClient(value = "weshop-marketing", path = "ad")
public interface AdApi extends Api<Ad> {
}