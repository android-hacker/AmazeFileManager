package com.amaze.filemanager.filesystem;

import android.os.Environment;

import java.io.File;

/**
 * @author weishu
 * @date 2018/7/4.
 */
public class VXPFoler {

        static final String VXP_PACKAGE = "io.va.exposed";

        public File folder;
        public String name;

        VXPFoler(File folder, String name) {
                this.folder = folder;
                this.name = name;
        }

        public static final VXPFoler INTERNAL = new VXPFoler(new File(Environment.getDataDirectory(), "data" + File.separator + VXP_PACKAGE),
                "Private Storage");
        public static final VXPFoler VXSDCAARD = new VXPFoler(new File(Environment.getExternalStorageDirectory(), "VirtualXposed"), "Virtual SDCard");
        public static final VXPFoler VEXTERNAL = new VXPFoler(new File(Environment.getExternalStorageDirectory(), "Android/data/" + VXP_PACKAGE), "External Storage");
}
