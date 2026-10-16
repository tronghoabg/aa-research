package com.applovin.impl;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* loaded from: classes.dex */
public class h4 {

    /* renamed from: a, reason: collision with root package name */
    private final View f21648a;

    /* renamed from: b, reason: collision with root package name */
    private final FriendlyObstructionPurpose f21649b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21650c;

    public h4(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f21648a = view;
        this.f21649b = friendlyObstructionPurpose;
        this.f21650c = str;
    }

    public String a() {
        return this.f21650c;
    }

    public FriendlyObstructionPurpose b() {
        return this.f21649b;
    }

    public View c() {
        return this.f21648a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            h4 h4Var = (h4) obj;
            View view = this.f21648a;
            if (view == null ? h4Var.f21648a != null : !view.equals(h4Var.f21648a)) {
                return false;
            }
            if (this.f21649b != h4Var.f21649b) {
                return false;
            }
            String str = this.f21650c;
            String str2 = h4Var.f21650c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        View view = this.f21648a;
        int iHashCode = (view != null ? view.hashCode() : 0) * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.f21649b;
        int iHashCode2 = (iHashCode + (friendlyObstructionPurpose != null ? friendlyObstructionPurpose.hashCode() : 0)) * 31;
        String str = this.f21650c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
