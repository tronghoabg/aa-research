package com.bytedance.sdk.openadsdk.moa;

import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class cz {
    private final WebView bcc;
    private int ivm;
    private final boolean lw;
    private final gzw uef;
    private int xs;
    private long zjm;
    private String cz = "landingpage";

    /* renamed from: oa, reason: collision with root package name */
    private final Map<Integer, Long> f25947oa = new HashMap();
    private final List<Integer> yo = new ArrayList();
    private final Map<Integer, String> moa = new HashMap();

    public cz(gzw gzwVar, WebView webView, boolean z2) {
        this.uef = gzwVar;
        this.bcc = webView;
        this.lw = z2;
    }

    public void oa(String str) {
        String str2 = this.moa.get(Integer.valueOf(this.ivm));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        String str3 = str2;
        int i5 = this.ivm;
        if (i5 > 0) {
            yo.uef(this.uef, this.cz, i5, str3, str, 1);
        }
    }

    public void uef(String str, int i5) {
        if (this.lw) {
            i5++;
        }
        if (uef(true)) {
            yo.uef(this.uef, this.cz, this.ivm, str, i5);
            this.moa.put(Integer.valueOf(this.ivm), str);
            this.zjm = SystemClock.elapsedRealtime();
        }
    }

    public void yo(String str) {
        this.cz = str;
    }

    private void oa(boolean z2) {
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = this.bcc.copyBackForwardList();
            if (webBackForwardListCopyBackForwardList != null) {
                if (z2) {
                    int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
                    this.ivm = currentIndex + 1;
                    if (this.lw) {
                        this.ivm = currentIndex + 2;
                        return;
                    }
                    return;
                }
                int currentIndex2 = webBackForwardListCopyBackForwardList.getCurrentIndex();
                this.xs = currentIndex2 + 1;
                if (this.lw) {
                    this.xs = currentIndex2 + 2;
                }
            }
        } catch (Throwable th) {
            dhk.yo("ArbitrageLandingLog", th.toString());
        }
    }

    public void uef(String str) {
        if (uef(false)) {
            yo.uef(this.uef, this.cz, this.ivm, str, SystemClock.elapsedRealtime() - this.zjm);
        }
    }

    public void uef(WebView webView, String str) {
        gzw gzwVar = this.uef;
        if (gzwVar == null || !com.bytedance.sdk.component.cz.oa.uef(gzwVar.rt().yo(), str)) {
            return;
        }
        String str2 = this.moa.get(Integer.valueOf(this.ivm));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        yo.uef(this.uef, this.cz, this.ivm, str2, str, 2);
    }

    private boolean uef(boolean z2) {
        int i5 = z2 ? this.ivm : this.xs;
        oa(z2);
        int i10 = z2 ? this.ivm : this.xs;
        return i10 > 0 && i10 != i5;
    }
}
