package com.bytedance.sdk.openadsdk.component.reward.yo.uef;

import android.os.Handler;
import android.os.Message;
import com.bytedance.sdk.component.utils.ue;

/* loaded from: classes3.dex */
public class oa implements ue.uef {
    private long moa;

    /* renamed from: oa, reason: collision with root package name */
    private uef f25466oa;
    private long yo;
    private Handler uef = new ue(this);
    private boolean lw = false;
    private boolean ivm = false;
    private int xs = 10000;
    private int bcc = 10000;

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.yo.uef.oa$oa, reason: collision with other inner class name */
    public enum EnumC0079oa {
        NORMAL,
        TIMEOUT,
        DISCONNECTED
    }

    public interface uef {
        void uef();

        void uef(EnumC0079oa enumC0079oa);
    }

    private void moa() {
        if (this.lw && this.ivm && System.currentTimeMillis() - this.yo >= this.xs) {
            this.ivm = false;
            uef uefVar = this.f25466oa;
            if (uefVar != null) {
                uefVar.uef(EnumC0079oa.TIMEOUT);
            }
            uef();
        }
    }

    private void yo() {
        if (!this.lw || this.f25466oa == null) {
            return;
        }
        this.yo = System.currentTimeMillis();
        this.ivm = true;
        this.f25466oa.uef();
        this.uef.removeMessages(2);
        this.uef.sendEmptyMessageDelayed(2, this.bcc);
        this.uef.removeMessages(1);
        this.uef.sendEmptyMessageDelayed(1, this.xs);
    }

    public void oa(int i5) {
        this.bcc = i5;
    }

    public void uef(int i5) {
        this.xs = i5;
    }

    public void oa() {
        if (this.lw && this.ivm) {
            this.moa = System.currentTimeMillis();
            this.ivm = false;
            this.uef.removeMessages(2);
            uef uefVar = this.f25466oa;
            if (uefVar != null) {
                uefVar.uef(EnumC0079oa.NORMAL);
            }
        }
    }

    public void uef(uef uefVar) {
        if (this.lw) {
            return;
        }
        this.f25466oa = uefVar;
        this.lw = true;
        this.ivm = false;
        this.uef.sendEmptyMessage(1);
        if (uefVar != null) {
            uefVar.uef(EnumC0079oa.NORMAL);
        }
    }

    public void uef() {
        this.lw = false;
        this.ivm = false;
        this.uef.removeMessages(1);
        this.uef.removeMessages(2);
        this.f25466oa = null;
    }

    @Override // com.bytedance.sdk.component.utils.ue.uef
    public void uef(Message message) {
        int i5 = message.what;
        if (i5 == 1) {
            yo();
        } else {
            if (i5 != 2) {
                return;
            }
            moa();
        }
    }
}
