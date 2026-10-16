package com.bykv.vk.openvk.uef.uef.uef.yo;

import android.os.Build;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class yo implements Serializable {

    /* renamed from: ab, reason: collision with root package name */
    private int f24521ab;
    private String bcc;
    private String bs;
    private boolean cz;
    private boolean dhk;
    private String dz;
    private oa ivm;

    /* renamed from: oa, reason: collision with root package name */
    public String f24522oa;
    private boolean oib;
    private int orq;
    private long sy;
    private int tpx;

    /* renamed from: ue, reason: collision with root package name */
    private int f24523ue;
    private int wk;
    private oa xs;
    public int yo;
    private boolean zjm;
    private int dj = 204800;
    private int wrv = 0;
    private int cq = 0;
    protected float uef = -1.0f;
    public final HashMap<String, Object> moa = new HashMap<>();
    private int gzw = 10000;
    private int gsd = 10000;
    private int rt = 10000;
    private int gr = 0;
    public int lw = 1;
    private JSONObject pz = new JSONObject();

    public yo(String str, oa oaVar, oa oaVar2, int i5, int i10) {
        this.tpx = 0;
        this.orq = 0;
        this.bcc = str;
        this.ivm = oaVar;
        this.xs = oaVar2;
        this.tpx = i5;
        this.orq = i10;
    }

    public String ab() {
        if (dz()) {
            return this.xs.dj();
        }
        oa oaVar = this.ivm;
        if (oaVar != null) {
            return oaVar.dj();
        }
        return null;
    }

    public int bcc() {
        return this.wk;
    }

    public String bs() {
        if (dz()) {
            return this.xs.dz();
        }
        oa oaVar = this.ivm;
        if (oaVar != null) {
            return oaVar.dz();
        }
        return null;
    }

    public boolean cq() {
        if (dz()) {
            return this.xs.tpx();
        }
        oa oaVar = this.ivm;
        if (oaVar != null) {
            return oaVar.tpx();
        }
        return true;
    }

    public int cz() {
        return this.f24521ab;
    }

    public int dhk() {
        return this.gsd;
    }

    public boolean dj() {
        return this.oib;
    }

    public boolean dz() {
        oa oaVar;
        if (this.orq != 1 || (oaVar = this.xs) == null || TextUtils.isEmpty(oaVar.dj())) {
            return false;
        }
        return com.bykv.vk.openvk.uef.uef.uef.yo.lw() == 2 ? Build.VERSION.SDK_INT >= 26 : this.tpx == 1;
    }

    public boolean gr() {
        return this.zjm;
    }

    public oa gsd() {
        return this.xs;
    }

    public oa gzw() {
        return this.ivm;
    }

    public int ivm() {
        if (dz()) {
            return this.xs.wk();
        }
        oa oaVar = this.ivm;
        if (oaVar != null) {
            return oaVar.wk();
        }
        return 0;
    }

    public String lw() {
        return this.bcc;
    }

    public int moa() {
        return this.pz.optInt("pitaya_cache_size", 0);
    }

    public boolean oa() {
        return this.f24523ue == 2;
    }

    public int oib() {
        return this.gzw;
    }

    public int orq() {
        return this.gr;
    }

    public boolean rt() {
        return this.cz;
    }

    public int sy() {
        return this.tpx;
    }

    public int tpx() {
        return this.rt;
    }

    public void uef(int i5) {
        this.f24523ue = i5;
    }

    public float wk() {
        float f10 = this.uef;
        if (f10 != -1.0f) {
            return f10;
        }
        if (dz()) {
            return this.xs.bcc();
        }
        oa oaVar = this.ivm;
        if (oaVar != null) {
            return oaVar.bcc();
        }
        return -1.0f;
    }

    public long wrv() {
        if (dz()) {
            return this.xs.lw();
        }
        oa oaVar = this.ivm;
        if (oaVar != null) {
            return oaVar.lw();
        }
        return 0L;
    }

    public boolean xs() {
        return this.dhk;
    }

    public JSONObject yo() {
        return this.pz;
    }

    public long zjm() {
        return this.sy;
    }

    public void bcc(int i5) {
        this.gr = i5;
    }

    public synchronized Object lw(String str) {
        return this.moa.get(str);
    }

    public void moa(String str) {
        this.f24522oa = str;
    }

    public void oa(String str) {
        this.dz = str;
    }

    public boolean uef() {
        int i5 = this.f24523ue;
        return i5 == 1 || i5 == 2;
    }

    public void xs(int i5) {
        this.rt = i5;
    }

    public void yo(int i5) {
        this.f24521ab = i5;
    }

    public void lw(int i5) {
        this.gzw = i5;
    }

    public void moa(int i5) {
        this.yo = i5;
    }

    public void oa(int i5) {
        this.wk = i5;
    }

    public void uef(String str) {
        this.bcc = str;
    }

    public void yo(String str) {
        this.bs = str;
    }

    public void oa(boolean z2) {
        this.cz = z2;
    }

    public void uef(long j8) {
        this.sy = j8;
    }

    public void yo(boolean z2) {
        this.zjm = z2;
    }

    public void ivm(int i5) {
        this.gsd = i5;
    }

    public void uef(boolean z2) {
        this.oib = z2;
    }

    public synchronized void uef(String str, Object obj) {
        this.moa.put(str, obj);
    }
}
