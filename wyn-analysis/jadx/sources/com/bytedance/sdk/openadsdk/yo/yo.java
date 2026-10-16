package com.bytedance.sdk.openadsdk.yo;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.ku;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.yo.moa;
import com.bytedance.sdk.openadsdk.yo.wrv;
import java.util.List;

/* loaded from: classes3.dex */
public class yo implements ku {
    private ku.uef lw;
    private boolean moa;

    /* renamed from: oa, reason: collision with root package name */
    private final Context f26204oa;
    public wrv uef;
    private moa yo;

    public yo(Context context, String str, List<FilterWord> list, gzw gzwVar) {
        this.f26204oa = context;
        uef(str, list, gzwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void moa() {
        Context context = this.f26204oa;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing() || this.uef.isShowing()) {
            return;
        }
        this.uef.show();
    }

    private void uef(String str, List<FilterWord> list, gzw gzwVar) {
        this.yo = new moa(this.f26204oa, str, list);
        wrv wrvVar = new wrv(this.f26204oa, this.yo.getDislikeManager());
        this.uef = wrvVar;
        wrvVar.uef(gzwVar);
        this.uef.uef(new wrv.uef() { // from class: com.bytedance.sdk.openadsdk.yo.yo.1
            @Override // com.bytedance.sdk.openadsdk.yo.wrv.uef
            public void oa() {
                yo.this.uef();
            }

            @Override // com.bytedance.sdk.openadsdk.yo.wrv.uef
            public void uef() {
            }

            @Override // com.bytedance.sdk.openadsdk.yo.wrv.uef
            public void yo() {
                yo.this.uef();
            }

            @Override // com.bytedance.sdk.openadsdk.yo.wrv.uef
            public void uef(int i5, FilterWord filterWord, String str2) {
                yo.this.yo.onSuggestionSubmit(str2);
                yo.this.uef();
            }
        });
        this.yo.uef(new moa.uef() { // from class: com.bytedance.sdk.openadsdk.yo.yo.2
            @Override // com.bytedance.sdk.openadsdk.yo.moa.uef
            public void oa() {
                try {
                    if (yo.this.lw != null) {
                        yo.this.lw.uef();
                    }
                } catch (Throwable th) {
                    dhk.uef("TTAdDislikeImpl", "dislike callback cancel error: ", th);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.yo.moa.uef
            public void uef() {
                yo.this.uef(true);
                if (yo.this.yo != null && yo.this.yo.isShowing()) {
                    yo.this.yo.hide();
                }
                yo.this.moa();
            }

            @Override // com.bytedance.sdk.openadsdk.yo.moa.uef
            public void uef(int i5, FilterWord filterWord) {
                try {
                    if (!filterWord.hasSecondOptions() && yo.this.lw != null) {
                        yo.this.lw.uef(i5, filterWord.getName());
                    }
                    filterWord.getName();
                } catch (Throwable unused) {
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.ku
    public void oa() {
        moa moaVar = this.yo;
        if (moaVar != null) {
            moaVar.destroy();
        }
    }

    public boolean yo() {
        return this.moa;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ku
    public void uef() {
        Context context = this.f26204oa;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing() || this.yo.isShowing()) {
            return;
        }
        this.yo.show();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ku
    public void uef(ku.uef uefVar) {
        this.lw = uefVar;
    }

    public void uef(boolean z2) {
        this.moa = z2;
    }
}
