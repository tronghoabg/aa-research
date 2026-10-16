package com.bytedance.sdk.openadsdk.orq.uef;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.cq.xs;
import com.bytedance.sdk.openadsdk.gzw.lw;
import com.bytedance.sdk.openadsdk.orq.uef.uef;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.km;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class moa {

    /* renamed from: oa, reason: collision with root package name */
    private static volatile moa f26076oa;
    private final Handler uef;
    private int yo = 0;
    private int moa = 2;
    private int lw = 3600000;
    private final ArrayList<oa> ivm = new ArrayList<>();

    private moa() {
        km.yo((Runnable) new com.bytedance.sdk.component.bcc.oa.yo("pag_pre_render_init") { // from class: com.bytedance.sdk.openadsdk.orq.uef.moa.1
            @Override // java.lang.Runnable
            public void run() {
                moa.this.yo = lw.uef("plb_pre_render_enable", 0);
                moa.this.moa = lw.uef("plb_pre_render_max_count", 2);
                if (moa.this.moa <= 0 || moa.this.moa > 4) {
                    moa.this.moa = 2;
                }
                moa.this.lw = lw.uef("plb_pre_render_alive_time", 3600000);
                if (moa.this.lw <= 0 || moa.this.lw > 3600000) {
                    moa.this.lw = 3600000;
                }
            }
        });
        this.uef = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.orq.uef.moa.2
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (!(message.obj instanceof oa)) {
                    return false;
                }
                moa.this.ivm.remove(message.obj);
                ((oa) message.obj).moa();
                return true;
            }
        });
    }

    public static moa uef() {
        if (f26076oa == null) {
            synchronized (moa.class) {
                try {
                    if (f26076oa == null) {
                        f26076oa = new moa();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f26076oa;
    }

    public boolean oa() {
        return this.yo == 1;
    }

    public void uef(final gzw gzwVar) {
        if (oa() && gzwVar != null && cp.ivm(gzwVar)) {
            final String strOfp = gzwVar.ofp();
            if (TextUtils.isEmpty(strOfp)) {
                return;
            }
            km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.orq.uef.moa.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (moa.this.ivm.size() >= moa.this.moa) {
                            moa.this.ivm.size();
                            oa oaVar = (oa) moa.this.ivm.remove(0);
                            if (oaVar != null) {
                                moa.this.uef.removeMessages(oaVar.cz().hashCode());
                                oaVar.moa();
                            }
                        }
                        gzwVar.ab(true);
                        Context contextUef = sy.uef();
                        gzw gzwVar2 = gzwVar;
                        final oa oaVar2 = new oa(contextUef, gzwVar2, gzwVar2.cgg(), true, new FrameLayout(sy.uef()), strOfp);
                        moa.this.ivm.add(oaVar2);
                        oaVar2.bcc();
                        Message messageObtain = Message.obtain();
                        messageObtain.what = strOfp.hashCode();
                        messageObtain.obj = oaVar2;
                        moa.this.uef.sendMessageDelayed(messageObtain, moa.this.lw);
                        oaVar2.uef(new uef.oa() { // from class: com.bytedance.sdk.openadsdk.orq.uef.moa.3.1
                            @Override // com.bytedance.sdk.openadsdk.orq.uef.uef.oa
                            public void uef() {
                                moa.this.uef.removeMessages(strOfp.hashCode());
                                moa.this.ivm.remove(oaVar2);
                                oaVar2.moa();
                            }
                        });
                        gzw gzwVar3 = gzwVar;
                        com.bytedance.sdk.openadsdk.moa.yo.uef(gzwVar3, gb.yo(gzwVar3.cl().getDurationSlotType()), "PL_start_pre_render", 1);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
            });
        }
    }

    public oa uef(gzw gzwVar, FrameLayout frameLayout, xs xsVar) {
        oa oaVar;
        if (oa() && gzwVar.cl() != null && !TextUtils.isEmpty(gzwVar.cl().getBidAdm()) && cp.ivm(gzwVar) && frameLayout != null) {
            String strOfp = gzwVar.ofp();
            if (TextUtils.isEmpty(strOfp)) {
                return null;
            }
            int i5 = 0;
            while (true) {
                if (i5 >= this.ivm.size()) {
                    i5 = -1;
                    oaVar = null;
                    break;
                }
                oaVar = this.ivm.get(i5);
                if (strOfp.equals(oaVar.cz())) {
                    break;
                }
                i5++;
            }
            if (oaVar != null) {
                this.uef.removeMessages(strOfp.hashCode());
                this.ivm.remove(i5);
                this.ivm.size();
                gzwVar.ab(true);
                oaVar.uef(frameLayout, xsVar);
                com.bytedance.sdk.openadsdk.moa.yo.uef(gzwVar, gb.yo(gzwVar.cl().getDurationSlotType()), "PL_use_pre_render", 1);
                return oaVar;
            }
        }
        return null;
    }
}
