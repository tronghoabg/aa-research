package com.bytedance.sdk.component.uef;

import android.webkit.WebView;
import com.bytedance.sdk.component.uef.yo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class wk {
    private volatile boolean lw;
    private final List<wrv> moa;

    /* renamed from: oa, reason: collision with root package name */
    private final WebView f25093oa;
    private final uef uef;
    private final cz yo;

    public wk(cz czVar) {
        ArrayList arrayList = new ArrayList();
        this.moa = arrayList;
        this.lw = false;
        this.yo = czVar;
        if (czVar.uef != null) {
            uef uefVar = czVar.f25082oa;
            if (uefVar == null) {
                this.uef = new dhk();
            } else {
                this.uef = uefVar;
            }
        } else {
            this.uef = czVar.f25082oa;
        }
        this.uef.yo(czVar);
        this.f25093oa = czVar.uef;
        arrayList.add(czVar.cz);
        oib.uef(czVar.xs);
    }

    private void oa() {
        if (this.lw) {
            bcc.uef(new IllegalStateException("JsBridge2 is already released!!!"));
        }
    }

    public static cz uef(WebView webView) {
        return new cz(webView);
    }

    public wk uef(String str, moa<?, ?> moaVar) {
        return uef(str, (String) null, moaVar);
    }

    public wk uef(Set<String> set, sy<?, ?> syVar) {
        return uef(set, (String) null, syVar);
    }

    public wk uef(String str, String str2, moa<?, ?> moaVar) {
        oa();
        this.uef.xs.uef(str, moaVar);
        return this;
    }

    public wk uef(Set<String> set, String str, sy<?, ?> syVar) {
        oa();
        this.uef.xs.uef(set, syVar);
        return this;
    }

    public wk uef(String str, yo.oa oaVar) {
        return uef(str, (String) null, oaVar);
    }

    public wk uef(String str, String str2, yo.oa oaVar) {
        oa();
        this.uef.xs.uef(str, oaVar);
        return this;
    }

    public void uef() {
        if (this.lw) {
            return;
        }
        this.uef.oa();
        this.lw = true;
        Iterator<wrv> it = this.moa.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
