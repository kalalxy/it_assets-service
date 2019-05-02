package com.fhq.controller;

import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {

    /**
     * default page
     * @return
     */
//    @RequiresAuthentication
    @RequestMapping("/default.html")
    public String defaultMapper(){
       return "default";
    }

    /**
     * crr_assets
     * @return
     */
//    @RequiresAuthentication
    @RequestMapping("/assets_in.html")
    public String assetsIn(){
        return "assets_in";
    }

    /**
     * crr_assets
     * @return
     */
//    @RequiresAuthentication
    @RequestMapping("/assets_out.html")
    public String assetsOut(){
        return "assets_out";
    }
    /**
     * crr_assets
     * @return
     */
//    @RequiresAuthentication
    @RequestMapping("/data_backup_handler.html")
    public String dataBackupHandler(){
        return "data_backup_handler";
    }
    /**
     * crr_assets
     * @return
     */
//    @RequiresAuthentication
    @RequestMapping("/ip_white_sheet.html")
    public String ipWhiteSheet(){
        return "ip_white_sheet";
    }
    /**
     * crr_assets
     * @return
     */
//    @RequiresAuthentication
    @RequestMapping("/member_handler.html")
    public String memberHandler(){
        return "member_handler";
    }
    /**
     * crr_assets
     * @return
     */
    @RequiresAuthentication
    @RequestMapping("/crr_assets.html")
    public String crrAssets(){
        return "crr_assets";
    }

    /**
     * crr_assets
     * @return
     */
//    @RequiresAuthentication
    @RequestMapping("/member_permission_handler.html")
    public String memberPermissionHandler(){
        return "member_permission_handler";
    }
    /**
     * crr_assets
     * @return
     */
//    @RequiresAuthentication
    @RequestMapping("/opr_log_handler.html")
    public String oprLogHandler(){
        return "opr_log_handler";
    }
    /**
     * crr_assets
     * @return
     */
//    @RequiresAuthentication
    @RequestMapping("/permissions_handler.html")
    public String permissionsHandler(){
        return "permissions_handler";
    }
    /**
     * crr_assets
     * @return
     */
//    @RequiresAuthentication
    @RequestMapping("/report_day.html")
    public String reportDay(){
        return "report_day";
    }
    /**
     * crr_assets
     * @return
     */
//    @RequiresAuthentication
    @RequestMapping("/report_detail.html")
    public String reportDetail(){
        return "report_detail";
    }
    /**
     * crr_assets
     * @return
     */
//    @RequiresAuthentication
    @RequestMapping("/report_month.html")
    public String reportMonth(){
        return "report_month";
    }
    /**
     * crr_assets
     * @return
     */
//    @RequiresAuthentication
    @RequestMapping("/report_total.html")
    public String reportTotal(){
        return "report_total";
    }
    /**
     * crr_assets
     * @return
     */
//    @RequiresAuthentication
    @RequestMapping("/report_year.html")
    public String reportYear(){
        return "report_year";
    }
    /**
     * crr_assets
     * @return
     */
//    @RequiresAuthentication
    @RequestMapping("/system_parameters.html")
    public String systemParameters(){
        return "system_parameters";
    }

}
