package com.gowtham.library.utils;

import android.graphics.Color;

public class TrimVideoOptions {

    public String fileName;

    public TrimType trimType = TrimType.DEFAULT;

    public long minDuration, fixedDuration;

    public boolean hideSeekBar;

    public boolean accurateCut;

    public boolean bypassPermissionsCheck = false;

    public boolean showFileLocationAlert;

    public long[] minToMax;

    public String title;

    public String local;

    public TrimGranularity granularity;

    public Integer toolbarColor;

    public boolean isLightStatusBar = true;

    public TrimVideoOptions() {
    }

}
