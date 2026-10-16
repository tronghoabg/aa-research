package com.bytedance.sdk.component.ivm.uef.uef.uef.uef;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.dhk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class yo {
    private static int yo = 20;
    private boolean bcc;
    private boolean lw;
    private final Context uef;

    /* renamed from: oa, reason: collision with root package name */
    protected final List<com.bytedance.sdk.component.ivm.uef.moa.uef> f25015oa = new ArrayList();
    private final List<com.bytedance.sdk.component.ivm.uef.moa.uef> moa = new ArrayList();
    private boolean ivm = false;
    private volatile boolean xs = false;
    private final Runnable cz = new Runnable() { // from class: com.bytedance.sdk.component.ivm.uef.uef.uef.uef.yo.1
        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList;
            synchronized (yo.this) {
                try {
                    yo.this.xs = false;
                    if (yo.this.f25015oa.isEmpty()) {
                        yo.this.ivm = false;
                        return;
                    }
                    if (yo.this.lw) {
                        int size = yo.this.f25015oa.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            yo.this.moa.add(yo.this.f25015oa.get(i5));
                        }
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(yo.this.f25015oa);
                    }
                    yo.this.f25015oa.clear();
                    yo.this.ivm = false;
                    if (arrayList != null) {
                        yo.this.moa(arrayList);
                        return;
                    }
                    yo yoVar = yo.this;
                    yoVar.moa(yoVar.moa);
                    yo.this.moa.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    public yo(Context context) {
        this.bcc = true;
        this.uef = context;
        try {
            com.bytedance.sdk.component.ivm.uef.lw lwVarWk = com.bytedance.sdk.component.ivm.uef.xs.ivm().wk();
            if (lwVarWk != null) {
                this.bcc = lwVarWk.cq();
                this.lw = lwVarWk.dz();
                yo = lwVarWk.wk();
            }
            dhk.uef("DBInsertMemRepo", "enableOpt:" + this.bcc + ",BATCH_SIZE:" + yo, Boolean.valueOf(this.lw));
        } catch (Throwable unused) {
        }
    }

    public long ivm() {
        return 10000L;
    }

    public Context lw() {
        return this.uef;
    }

    public void moa(List<com.bytedance.sdk.component.ivm.uef.moa.uef> list) {
        com.bytedance.sdk.component.ivm.uef.uef.uef.yo.uef(lw(), oa(), list);
    }

    public abstract String oa();

    public synchronized void yo(List<String> list) {
        if (list != null) {
            if (!list.isEmpty()) {
                try {
                    Iterator<com.bytedance.sdk.component.ivm.uef.moa.uef> it = this.f25015oa.iterator();
                    while (it.hasNext()) {
                        com.bytedance.sdk.component.ivm.uef.moa.uef next = it.next();
                        if (next != null) {
                            String strYo = next.yo();
                            if (!TextUtils.isEmpty(strYo) && list.contains(strYo)) {
                                it.remove();
                            }
                        }
                    }
                } catch (Throwable th) {
                    oa();
                    th.getMessage();
                }
            }
        }
    }

    private void uef() {
        if (!this.ivm) {
            com.bytedance.sdk.component.ivm.uef.xs.uef.uef().postDelayed(this.cz, this.lw ? ivm() : com.bytedance.sdk.component.ivm.uef.xs.uef.oa());
            this.ivm = true;
        }
        if (this.bcc && this.f25015oa.size() >= yo && !this.xs) {
            com.bytedance.sdk.component.ivm.uef.xs.uef.uef().removeCallbacks(this.cz);
            com.bytedance.sdk.component.ivm.uef.xs.uef.uef().post(this.cz);
            this.ivm = true;
            this.xs = true;
        }
    }

    public synchronized void uef(com.bytedance.sdk.component.ivm.uef.moa.uef uefVar) {
        if (uefVar.ivm() != null && !TextUtils.isEmpty(uefVar.yo())) {
            this.f25015oa.add(uefVar);
            uef();
        }
    }
}
