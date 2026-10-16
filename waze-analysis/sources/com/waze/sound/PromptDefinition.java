package com.waze.sound;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class PromptDefinition {
    public static final int PROMPT_IMPERIAL_ONLY = 2;
    public static final int PROMPT_METRIC_AND_IMPERIAL = 0;
    public static final int PROMPT_METRIC_ONLY = 1;
    private int mCategory;
    private int mDisplayText;
    private String mId;
    private int mMaxSeconds;
    private int mMode;

    public PromptDefinition(String str, int i2, int i3, int i4, int i5) {
        this.mId = str;
        this.mDisplayText = i2;
        this.mCategory = i3;
        this.mMaxSeconds = i4;
        this.mMode = i5;
    }

    public String getCategory() {
        return com.waze.shared_infra.o.b.a().d(DisplayStrings.fromDisplayStringId(this.mCategory), true);
    }

    public String getDisplayText() {
        return com.waze.shared_infra.o.b.a().d(DisplayStrings.fromDisplayStringId(this.mDisplayText), true);
    }

    public String getId() {
        return this.mId;
    }

    public int getMaxSeconds() {
        return this.mMaxSeconds;
    }

    public int getMode() {
        return this.mMode;
    }

    public PromptDefinition(String str, int i2, int i3, int i4) {
        this(str, i2, i3, i4, 0);
    }
}
