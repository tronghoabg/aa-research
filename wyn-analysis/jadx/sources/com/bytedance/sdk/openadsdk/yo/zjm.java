package com.bytedance.sdk.openadsdk.yo;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class zjm {

    /* renamed from: ab, reason: collision with root package name */
    private int f26206ab;
    private FilterWord bs;
    private JSONObject cq;
    private String dj;
    private gzw dz;
    private int wk;
    private String wrv;
    private String zjm;
    public static FilterWord uef = new FilterWord("", "");

    /* renamed from: oa, reason: collision with root package name */
    public static int f26205oa = 1;
    public static int yo = 2;
    public static int moa = 3;
    public static int lw = 4;
    private final Set<yo> ivm = new HashSet();
    private final Set<oa> xs = new HashSet();
    private final Set<moa> bcc = new HashSet();
    private final Set<uef> cz = new HashSet();

    public interface moa {
        void uef(String str);
    }

    public interface oa {
        void uef(int i5);
    }

    public interface uef {
        void uef(List<FilterWord> list);
    }

    public interface yo {
        void uef(FilterWord filterWord);
    }

    private void zjm() {
        Iterator<yo> it = this.ivm.iterator();
        while (it.hasNext()) {
            it.next().uef(this.bs);
        }
    }

    public int bcc() {
        return this.wk;
    }

    public boolean cz() {
        return this.wk < this.f26206ab;
    }

    public void ivm() {
        Iterator<oa> it = this.xs.iterator();
        while (it.hasNext()) {
            it.next().uef(lw);
        }
    }

    public void lw() {
        Iterator<oa> it = this.xs.iterator();
        while (it.hasNext()) {
            it.next().uef(yo);
        }
    }

    public void moa() {
        gzw gzwVar;
        if (!yo() && !TextUtils.isEmpty(this.wrv)) {
            this.bs = new FilterWord("0:00", this.wrv);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.bs);
        if (!TextUtils.isEmpty(this.zjm)) {
            if (TextUtils.isEmpty(this.wrv)) {
                com.bytedance.sdk.openadsdk.yo.oa.uef().uef(this.zjm, arrayList, this.dj);
            } else {
                if (this.cq == null && (gzwVar = this.dz) != null) {
                    this.cq = gzwVar.cq(true);
                }
                com.bytedance.sdk.openadsdk.yo.oa.uef().uef(this.zjm, arrayList, this.cq, this.wrv, this.dj);
            }
        }
        Iterator<oa> it = this.xs.iterator();
        while (it.hasNext()) {
            it.next().uef(f26205oa);
        }
        uef(uef);
        yo("");
    }

    public void oa(String str) {
        this.dj = str;
    }

    public void uef() {
        this.ivm.clear();
        this.xs.clear();
        this.bcc.clear();
        this.cz.clear();
    }

    public String xs() {
        return this.wrv;
    }

    public boolean yo() {
        FilterWord filterWord = this.bs;
        return (filterWord == null || filterWord.equals(uef)) ? false : true;
    }

    public FilterWord oa() {
        return this.bs;
    }

    public void yo(String str) {
        this.wrv = str;
        Iterator<moa> it = this.bcc.iterator();
        while (it.hasNext()) {
            it.next().uef(this.wrv);
        }
    }

    public void uef(String str) {
        this.zjm = str;
    }

    public void uef(FilterWord filterWord) {
        this.bs = filterWord;
        zjm();
    }

    public void uef(yo yoVar) {
        this.ivm.add(yoVar);
    }

    public void uef(oa oaVar) {
        this.xs.add(oaVar);
    }

    public void uef(moa moaVar) {
        this.bcc.add(moaVar);
    }

    public void uef(uef uefVar) {
        this.cz.add(uefVar);
    }

    public void uef(List<FilterWord> list) {
        Iterator<uef> it = this.cz.iterator();
        while (it.hasNext()) {
            it.next().uef(list);
        }
    }

    public void uef(gzw gzwVar) {
        this.dz = gzwVar;
    }

    public void uef(int i5, int i10) {
        this.wk = i5;
        this.f26206ab = i10;
    }
}
