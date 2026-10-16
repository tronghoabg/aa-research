package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class FilterWord {
    private List<FilterWord> moa;

    /* renamed from: oa, reason: collision with root package name */
    private String f25134oa;
    private String uef;
    private boolean yo;

    public FilterWord(String str, String str2) {
        this.uef = str;
        this.f25134oa = str2;
    }

    public void addOption(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.moa == null) {
            this.moa = new ArrayList();
        }
        this.moa.add(filterWord);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FilterWord)) {
            return false;
        }
        FilterWord filterWord = (FilterWord) obj;
        return filterWord.getId().equals(getId()) && filterWord.getName().equals(getName());
    }

    public String getId() {
        return this.uef;
    }

    public boolean getIsSelected() {
        return this.yo;
    }

    public String getName() {
        return this.f25134oa;
    }

    public List<FilterWord> getOptions() {
        return this.moa;
    }

    public boolean hasSecondOptions() {
        List<FilterWord> list = this.moa;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(this.uef) || TextUtils.isEmpty(this.f25134oa)) ? false : true;
    }

    public void setId(String str) {
        this.uef = str;
    }

    public void setIsSelected(boolean z2) {
        this.yo = z2;
    }

    public void setName(String str) {
        this.f25134oa = str;
    }

    public FilterWord() {
    }
}
