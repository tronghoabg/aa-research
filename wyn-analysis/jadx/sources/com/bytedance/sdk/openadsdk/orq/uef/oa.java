package com.bytedance.sdk.openadsdk.orq.uef;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.cq.xs;
import com.bytedance.sdk.openadsdk.utils.af;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class oa extends uef {
    private String ivm;
    private FrameLayout lw;
    private final FrameLayout moa;

    /* renamed from: oa, reason: collision with root package name */
    private volatile boolean f26079oa;
    private xs yo;

    public oa(Context context, gzw gzwVar, int i5, boolean z2, FrameLayout frameLayout, String str) {
        super(context, gzwVar, i5, z2, frameLayout);
        this.moa = frameLayout;
        this.ivm = str;
        oa(false);
        int iYo = af.yo(context);
        int iLw = af.lw(context);
        if (i5 == 1) {
            if (iYo <= iLw) {
                this.uef.layout(0, 0, iYo, iLw);
                return;
            }
        } else {
            if (i5 != 2) {
                return;
            }
            if (iYo > iLw) {
                this.uef.layout(0, 0, iYo, iLw);
                return;
            }
        }
        this.uef.layout(0, 0, iLw, iYo);
    }

    public void bcc() {
        super.uef(true, new xs() { // from class: com.bytedance.sdk.openadsdk.orq.uef.oa.1
            @Override // com.bytedance.sdk.openadsdk.cq.xs
            public void uef() {
                if (oa.this.yo != null) {
                    oa.this.yo.uef();
                } else {
                    oa.this.f26079oa = true;
                }
            }
        });
    }

    public String cz() {
        return this.ivm;
    }

    public void uef(FrameLayout frameLayout, xs xsVar) {
        this.lw = frameLayout;
        frameLayout.addView(this.moa);
        this.yo = xsVar;
        if (this.f26079oa) {
            this.yo.uef();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.orq.uef.uef
    public void uef() throws JSONException {
        this.lw.setVisibility(0);
        super.uef();
    }
}
