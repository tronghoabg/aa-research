package com.bytedance.sdk.component.cz;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.cp;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.component.utils.ue;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class uef extends yo implements ue.uef {

    /* renamed from: ab, reason: collision with root package name */
    private boolean f24979ab;
    private volatile float bcc;
    private float bs;
    private int cq;
    private View.OnTouchListener dhk;
    private long dj;
    private final Context ivm;
    private final int lw;
    private final List<Integer> moa;

    /* renamed from: oa, reason: collision with root package name */
    private final int f24980oa;
    private String oib;
    private float sy;
    private long wrv;
    private volatile float xs;
    private final int yo;
    private float cz = -1.0f;
    private float zjm = -1.0f;
    private final Handler wk = new ue(cz.uef().getLooper(), this);
    InterfaceC0059uef uef = new InterfaceC0059uef() { // from class: com.bytedance.sdk.component.cz.uef.1
        @Override // com.bytedance.sdk.component.cz.uef.InterfaceC0059uef
        public void uef() {
            if (uef.this.cz == -1.0f && uef.this.zjm == -1.0f && uef.this.wrv == -1) {
                float unused = uef.this.cz;
                float unused2 = uef.this.zjm;
                uef uefVar = uef.this;
                uefVar.cz = uefVar.xs;
                uef uefVar2 = uef.this;
                uefVar2.zjm = uefVar2.bcc;
                uef uefVar3 = uef.this;
                uefVar3.wrv = uefVar3.dj;
                uef.this.f24979ab = true;
            }
            float unused3 = uef.this.cz;
            float unused4 = uef.this.zjm;
        }

        @Override // com.bytedance.sdk.component.cz.uef.InterfaceC0059uef
        public void uef(int i5) {
            uef.this.cq = i5;
            uef.this.oa();
        }
    };
    private int tpx = -1;
    private final List<Integer> dz = new ArrayList();

    /* renamed from: com.bytedance.sdk.component.cz.uef$uef, reason: collision with other inner class name */
    public interface InterfaceC0059uef {
        void uef();

        void uef(int i5);
    }

    public uef(Context context, int i5, int i10, List<Integer> list, int i11) {
        this.ivm = context;
        if (i5 == -1) {
            this.f24980oa = cp.uef(context);
        } else {
            this.f24980oa = cp.uef(context, i5);
        }
        this.yo = cp.uef(context, i10);
        this.moa = list;
        this.lw = i11;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        uef uefVar;
        int action = motionEvent.getAction();
        motionEvent.getX();
        motionEvent.getY();
        float x5 = motionEvent.getX();
        float y10 = motionEvent.getY();
        this.dj = SystemClock.elapsedRealtime();
        this.xs = x5;
        this.bcc = y10;
        if (action == 0) {
            uefVar = this;
            uefVar.bs = x5;
            uefVar.sy = y10;
        } else if (action != 1) {
            uefVar = this;
        } else {
            uefVar = this;
            if (uefVar.uef(x5, y10, this.bs, this.sy, this.ivm)) {
                int iUef = uef(uefVar.xs, uefVar.bcc, uefVar.dj);
                boolean zContains = uefVar.dz.contains(Integer.valueOf(uefVar.cq));
                uef(view, motionEvent, iUef, !zContains);
                if (!zContains) {
                    uefVar.dz.add(Integer.valueOf(uefVar.cq));
                }
                if (iUef == 0) {
                    motionEvent.setAction(3);
                }
            }
        }
        View.OnTouchListener onTouchListener = uefVar.dhk;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(view, motionEvent);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa() {
        this.cz = -1.0f;
        this.zjm = -1.0f;
        this.wrv = -1L;
    }

    @Override // com.bytedance.sdk.component.cz.yo
    public void uef(View.OnTouchListener onTouchListener) {
        this.dhk = onTouchListener;
    }

    public InterfaceC0059uef uef() {
        return this.uef;
    }

    private void uef(View view, MotionEvent motionEvent, int i5, boolean z2) {
        String url;
        JSONObject jSONObject = new JSONObject();
        WebView webView = view instanceof WebView ? (WebView) view : null;
        if (webView != null) {
            try {
                url = webView.getUrl();
            } catch (Throwable unused) {
            }
        } else {
            url = "";
        }
        jSONObject.put("arbi_current_url", url);
        jSONObject.put("click_x", motionEvent.getX());
        jSONObject.put("click_y", motionEvent.getY());
        jSONObject.put("is_interceptor", i5 == 0 ? 1 : 0);
        jSONObject.put("is_first_click", z2 ? 1 : 0);
        jSONObject.put("click_timestamp", System.currentTimeMillis());
        jSONObject.put("arbi_interceptor_type", i5);
        jSONObject.put("current_url_index", this.cq);
        Message messageObtain = Message.obtain();
        messageObtain.what = 100;
        messageObtain.obj = jSONObject;
        this.wk.sendMessageDelayed(messageObtain, 200L);
    }

    public void uef(String str) {
        this.oib = str;
    }

    private int uef(float f10, float f11, long j8) {
        if (this.cz == -1.0f && this.zjm == -1.0f && this.wrv == -1) {
            return 1;
        }
        if (!this.moa.contains(Integer.valueOf(this.cq))) {
            return 2;
        }
        if (j8 - this.wrv > this.lw) {
            oa();
            return 3;
        }
        float fAbs = Math.abs(f10 - this.cz);
        float fAbs2 = Math.abs(f11 - this.zjm);
        if (fAbs <= this.f24980oa / 2.0f && fAbs2 <= this.yo / 2.0f) {
            return 0;
        }
        oa();
        return 4;
    }

    @Override // com.bytedance.sdk.component.utils.ue.uef
    public void uef(Message message) {
        int i5 = message.what;
        Object obj = message.obj;
        JSONObject jSONObject = new JSONObject();
        if (i5 == 100) {
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
                try {
                    jSONObject.put("is_trigger_jump", this.f24979ab ? 1 : 0);
                    this.f24979ab = false;
                } catch (Throwable unused) {
                }
            }
            if (com.bytedance.sdk.component.cz.uef.uef.uef().oa() != null) {
                com.bytedance.sdk.component.cz.uef.uef.uef().oa().uef(this.oib, "arbitrage_click_event", jSONObject);
            }
        }
    }
}
