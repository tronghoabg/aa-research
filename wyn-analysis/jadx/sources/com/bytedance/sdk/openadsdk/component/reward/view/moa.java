package com.bytedance.sdk.openadsdk.component.reward.view;

import A0.j;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.widget.ab;
import com.bytedance.sdk.openadsdk.core.widget.bs;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.Locale;
import org.apache.tika.metadata.TikaCoreProperties;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class moa extends com.bytedance.sdk.openadsdk.core.ivm.lw {
    private com.bytedance.sdk.openadsdk.component.reward.uef.oa bcc;
    private TextView ivm;
    private TextView lw;
    private bs moa;

    /* renamed from: oa, reason: collision with root package name */
    private TextView f25444oa;
    private ab uef;
    private boolean xs;
    private TextView yo;

    public static class uef implements com.bytedance.sdk.component.lw.ab {
        private final WeakReference<ImageView> moa;

        /* renamed from: oa, reason: collision with root package name */
        private final String f25446oa;
        private final gzw uef;
        private final String yo;

        public uef(ImageView imageView, gzw gzwVar, String str, String str2) {
            this.moa = new WeakReference<>(imageView);
            this.uef = gzwVar;
            this.f25446oa = str;
            this.yo = str2;
        }

        @Override // com.bytedance.sdk.component.lw.ab
        public void uef(com.bytedance.sdk.component.lw.dj djVar) {
            Object objOa = djVar.oa();
            if (objOa != null) {
                ImageView imageView = this.moa.get();
                if (objOa instanceof Bitmap) {
                    if (imageView != null) {
                        imageView.setImageBitmap((Bitmap) objOa);
                    }
                } else if (objOa instanceof Drawable) {
                    if (Build.VERSION.SDK_INT >= 28 && j.B(objOa)) {
                        j.k(objOa).start();
                    }
                    if (imageView != null) {
                        imageView.setImageDrawable((Drawable) objOa);
                    }
                }
                com.bytedance.sdk.openadsdk.moa.yo.oa(this.uef, this.yo, "load_vast_icon_success", (JSONObject) null);
            }
        }

        @Override // com.bytedance.sdk.component.lw.ab
        public void uef(int i5, String str, Throwable th) {
            uef(i5, str, this.f25446oa);
        }

        private void uef(final int i5, final String str, final String str2) {
            com.bytedance.sdk.openadsdk.moa.yo.uef(new com.bytedance.sdk.component.bcc.oa.yo("load_vast_icon_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.view.moa.uef.1
                @Override // java.lang.Runnable
                public void run() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("error_code", i5);
                        jSONObject.put("description", i5 + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + str);
                        jSONObject.put("url", str2);
                    } catch (Throwable unused) {
                    }
                    com.bytedance.sdk.openadsdk.moa.yo.oa(uef.this.uef, uef.this.yo, "load_vast_icon_fail", jSONObject);
                }
            });
        }
    }

    public moa(Context context) {
        super(context);
        setOrientation(1);
        setVisibility(8);
        setBackgroundColor(-1);
    }

    private String getCnOrEnBtnText() {
        return this.bcc.f25412oa.ykf() != 4 ? "View" : "Install";
    }

    private void ivm() {
        Context context = getContext();
        setPadding(af.oa(context, 16.0f), af.oa(context, 16.0f), af.oa(context, 16.0f), af.oa(context, 24.0f));
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        lwVar.setOrientation(0);
        lwVar.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = af.oa(context, 12.0f);
        addView(lwVar, layoutParams);
        bs bsVar = new bs(context);
        this.moa = bsVar;
        bsVar.setBackgroundColor(0);
        this.moa.setId(com.bytedance.sdk.openadsdk.utils.bs.moa);
        lwVar.addView(this.moa, new LinearLayout.LayoutParams(af.oa(context, 48.0f), af.oa(context, 48.0f)));
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar2 = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        lwVar2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = af.oa(context, 12.0f);
        lwVar.addView(lwVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        this.lw = bccVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        bccVar.setEllipsize(truncateAt);
        this.lw.setGravity(16);
        this.lw.setSingleLine(true);
        this.lw.setTextSize(2, 17.0f);
        this.lw.setId(com.bytedance.sdk.openadsdk.utils.bs.lw);
        this.lw.setTextColor(-16777216);
        lwVar2.addView(this.lw, new LinearLayout.LayoutParams(-1, -2));
        ab abVar = new ab(context);
        this.uef = abVar;
        abVar.setId(com.bytedance.sdk.openadsdk.utils.bs.xs);
        lwVar2.addView(this.uef, new LinearLayout.LayoutParams(-2, af.oa(context, 14.0f)));
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar2 = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        this.f25444oa = bccVar2;
        bccVar2.setGravity(17);
        this.f25444oa.setEllipsize(truncateAt);
        this.f25444oa.setSingleLine(true);
        this.f25444oa.setTextColor(-1);
        this.f25444oa.setTextSize(2, 16.0f);
        this.f25444oa.setId(520093705);
        this.f25444oa.setBackground(uef(context));
        this.f25444oa.setText(this.bcc.f25412oa.kik());
        addView(this.f25444oa, new LinearLayout.LayoutParams(-1, af.oa(context, 36.0f)));
    }

    private void lw() {
        setOrientation(0);
        setGravity(16);
        Context context = getContext();
        setPadding(af.oa(context, 16.0f), af.oa(context, 12.0f), af.oa(context, 16.0f), af.oa(context, 12.0f));
        bs bsVar = new bs(context);
        this.moa = bsVar;
        bsVar.setBackgroundColor(0);
        this.moa.setId(com.bytedance.sdk.openadsdk.utils.bs.moa);
        addView(this.moa, new LinearLayout.LayoutParams(af.oa(context, 48.0f), af.oa(context, 48.0f)));
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        lwVar.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.leftMargin = af.oa(context, 12.0f);
        layoutParams.weight = 1.0f;
        addView(lwVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        this.lw = bccVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        bccVar.setEllipsize(truncateAt);
        this.lw.setGravity(16);
        this.lw.setSingleLine(true);
        this.lw.setTextSize(2, 17.0f);
        this.lw.setId(com.bytedance.sdk.openadsdk.utils.bs.lw);
        this.lw.setTextColor(-16777216);
        lwVar.addView(this.lw, new LinearLayout.LayoutParams(-1, -2));
        ab abVar = new ab(context);
        this.uef = abVar;
        abVar.setId(com.bytedance.sdk.openadsdk.utils.bs.xs);
        lwVar.addView(this.uef, new LinearLayout.LayoutParams(-2, af.oa(context, 14.0f)));
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar2 = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        this.f25444oa = bccVar2;
        bccVar2.setGravity(17);
        this.f25444oa.setEllipsize(truncateAt);
        this.f25444oa.setSingleLine(true);
        this.f25444oa.setTextColor(-1);
        this.f25444oa.setTextSize(2, 16.0f);
        this.f25444oa.setId(520093705);
        this.f25444oa.setBackground(uef(context));
        this.f25444oa.setText(this.bcc.f25412oa.kik());
        addView(this.f25444oa, new LinearLayout.LayoutParams(af.oa(context, 164.0f), af.oa(context, 36.0f)));
    }

    private void moa() {
        this.xs = true;
        gzw gzwVar = this.bcc.f25412oa;
        int iWxf = gzwVar.wxf();
        if ((iWxf == 43 || iWxf == 44) && cp.oa(gzwVar)) {
            yo();
        } else if (this.bcc.etd == 1) {
            ivm();
        } else {
            lw();
        }
        if (this.f25444oa == null) {
            this.f25444oa = (TextView) this.bcc.km.findViewById(520093705);
        }
        TextView textView = this.f25444oa;
        if (textView != null) {
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.moa.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i5, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                    int width = ((ViewGroup) moa.this.f25444oa.getParent()).getWidth();
                    if (width > 0) {
                        moa.this.f25444oa.setMaxWidth((int) (width * 0.45f));
                    }
                }
            });
            if (!gzwVar.ebe()) {
                this.f25444oa.setText(gzwVar.bx() == 3 ? getButtonTextForNewStyleBar() : gzwVar.kik());
            } else if (gzwVar.nkc() != null && TextUtils.isEmpty(gzwVar.nkc().ivm())) {
                af.uef((View) this.f25444oa, 8);
            }
        }
        if (this.moa != null && gzwVar.ifk() != null && !TextUtils.isEmpty(gzwVar.ifk().uef())) {
            String strUef = gzwVar.ifk().uef();
            if (gzwVar.ebe()) {
                com.bytedance.sdk.openadsdk.zjm.moa.uef(gzwVar.ifk()).yo(1).uef(new com.bytedance.sdk.openadsdk.zjm.oa(gzwVar, gzwVar.ifk().uef(), new uef(this.moa, gzwVar, strUef, this.bcc.lw)));
                if (gzwVar.nkc() != null && gzwVar.nkc().oa() != null) {
                    gzwVar.nkc().oa().oa(0L);
                }
            } else {
                com.bytedance.sdk.openadsdk.dhk.oa.oa().uef(gzwVar.ifk(), this.moa, gzwVar);
            }
        }
        TextView textView2 = this.lw;
        if (textView2 != null) {
            textView2.setText(gzwVar.xw());
        }
        TextView textView3 = this.ivm;
        if (textView3 != null) {
            textView3.setText(uef(gzwVar));
        }
        if (this.yo != null) {
            String strGzw = cp.gzw(this.bcc.f25412oa);
            if (TextUtils.isEmpty(strGzw)) {
                strGzw = "Play now";
            }
            this.yo.setText(strGzw);
            this.yo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.moa.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (moa.this.bcc != null) {
                        com.bytedance.sdk.openadsdk.component.reward.oa.uef(moa.this.bcc);
                    }
                }
            });
        }
        ab abVar = this.uef;
        if (abVar != null) {
            af.uef((TextView) null, abVar, gzwVar);
        }
        if (this.bcc.etd == 2 && gzwVar.bx() == 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f25444oa.getLayoutParams();
            layoutParams.height = af.oa(this.bcc.af, 55.0f);
            layoutParams.topMargin = af.oa(this.bcc.af, 20.0f);
            this.f25444oa.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams2.bottomMargin = af.oa(this.bcc.af, 12.0f);
            setLayoutParams(layoutParams2);
        }
        oa();
    }

    public String getButtonTextForNewStyleBar() {
        boolean zEquals;
        String strKik;
        String strYo = gb.yo(this.bcc.af);
        if (strYo == null) {
            strYo = "";
        }
        try {
            zEquals = strYo.equals(Locale.ENGLISH.getLanguage());
        } catch (Throwable unused) {
            zEquals = false;
        }
        if (TextUtils.isEmpty(this.bcc.f25412oa.kik())) {
            strKik = this.bcc.f25412oa.ykf() != 4 ? "View" : "Install";
        } else {
            strKik = this.bcc.f25412oa.kik();
            if (strKik == null || !gb.xs(strKik) || strKik.length() <= 2) {
                if (strKik != null && !gb.xs(strKik) && strKik.length() > 7 && zEquals) {
                    strKik = getCnOrEnBtnText();
                }
            } else if (zEquals) {
                strKik = getCnOrEnBtnText();
            }
        }
        if (zEquals && !gb.xs(strKik)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f25444oa.getLayoutParams();
            layoutParams.bottomMargin = af.oa(this.bcc.af, 4.0f);
            this.f25444oa.setLayoutParams(layoutParams);
        }
        return strKik;
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        super.setVisibility(i5);
        if (i5 != 0 || this.xs) {
            return;
        }
        moa();
    }

    public void yo() {
        Context context = getContext();
        int iOa = af.oa(context, 12.0f);
        setPadding(iOa, iOa, iOa, iOa);
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        lwVar.setOrientation(0);
        lwVar.setGravity(16);
        addView(lwVar, layoutParams);
        bs bsVar = new bs(context);
        this.moa = bsVar;
        bsVar.setBackgroundColor(0);
        this.moa.setId(com.bytedance.sdk.openadsdk.utils.bs.moa);
        lwVar.addView(this.moa, new LinearLayout.LayoutParams(af.oa(context, 54.0f), af.oa(context, 54.0f)));
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar2 = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        lwVar2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = af.oa(context, 12.0f);
        lwVar.addView(lwVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        this.lw = bccVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        bccVar.setEllipsize(truncateAt);
        this.lw.setGravity(16);
        this.lw.setSingleLine(true);
        this.lw.setTextSize(2, 17.0f);
        this.lw.setId(com.bytedance.sdk.openadsdk.utils.bs.lw);
        this.lw.setTextColor(-16777216);
        lwVar2.addView(this.lw, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar2 = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        this.ivm = bccVar2;
        bccVar2.setTextColor(-16777216);
        this.ivm.setTextSize(2, 13.0f);
        this.ivm.setMaxLines(2);
        this.ivm.setAlpha(0.8f);
        this.ivm.setEllipsize(truncateAt);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = af.oa(context, 4.0f);
        lwVar2.addView(this.ivm, layoutParams3);
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar3 = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = af.oa(context, 12.0f);
        lwVar3.setOrientation(0);
        addView(lwVar3, layoutParams4);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar3 = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        this.yo = bccVar3;
        bccVar3.setGravity(17);
        this.yo.setEllipsize(truncateAt);
        this.yo.setSingleLine(true);
        this.yo.setTextColor(-16777216);
        this.yo.setTextSize(2, 16.0f);
        this.yo.setBackground(oa(context));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, af.oa(context, 36.0f), 1.0f);
        layoutParams5.rightMargin = af.oa(context, 3.0f);
        lwVar3.addView(this.yo, layoutParams5);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar4 = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        this.f25444oa = bccVar4;
        bccVar4.setGravity(17);
        this.f25444oa.setEllipsize(truncateAt);
        this.f25444oa.setSingleLine(true);
        this.f25444oa.setTextColor(-1);
        this.f25444oa.setTextSize(2, 16.0f);
        this.f25444oa.setId(520093705);
        this.f25444oa.setBackground(yo(context));
        this.f25444oa.setText(this.bcc.f25412oa.kik());
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, af.oa(context, 36.0f), 1.0f);
        layoutParams6.leftMargin = af.oa(context, 3.0f);
        lwVar3.addView(this.f25444oa, layoutParams6);
    }

    private String uef(gzw gzwVar) {
        return !TextUtils.isEmpty(gzwVar.xw()) ? gzwVar.xw() : !TextUtils.isEmpty(gzwVar.az()) ? gzwVar.az() : "";
    }

    public void oa() {
        com.bytedance.sdk.openadsdk.core.yo.lw lwVarLw = this.bcc.gr.lw();
        final com.bytedance.sdk.openadsdk.core.yo.oa oaVarMoa = this.bcc.gr.moa();
        final gzw gzwVar = this.bcc.f25412oa;
        if (gzwVar.fzf() == null) {
            return;
        }
        if (gzwVar.bx() != 5 && this.f25444oa != null) {
            if (gzwVar.fzf().lw) {
                this.f25444oa.setOnClickListener(lwVarLw);
                this.f25444oa.setOnTouchListener(lwVarLw);
            } else {
                this.f25444oa.setOnClickListener(oaVarMoa);
            }
        }
        if (gzwVar.bx() == 1) {
            if (!gzwVar.fzf().uef) {
                af.uef((View) this, (View.OnClickListener) oaVarMoa, "TTBaseVideoActivity#mRlDownloadBar");
                this.lw.setOnClickListener(oaVarMoa);
                this.uef.setOnClickListener(oaVarMoa);
                this.moa.setOnClickListener(oaVarMoa);
                return;
            }
            af.uef((View) this, (View.OnClickListener) lwVarLw, "TTBaseVideoActivity#mRlDownloadBar");
            af.uef((View) this, (View.OnTouchListener) lwVarLw, "TTBaseVideoActivity#mRlDownloadBar");
            this.lw.setOnClickListener(lwVarLw);
            this.lw.setOnTouchListener(lwVarLw);
            this.uef.setOnClickListener(lwVarLw);
            this.uef.setOnTouchListener(lwVarLw);
            this.moa.setOnClickListener(lwVarLw);
            this.moa.setOnTouchListener(lwVarLw);
            return;
        }
        if (gzwVar.bx() != 5) {
            if (!gzwVar.fzf().yo) {
                af.uef((View) this, (View.OnClickListener) oaVarMoa, "TTBaseVideoActivity#mRlDownloadBar");
                return;
            } else {
                af.uef((View) this, (View.OnClickListener) lwVarLw, "TTBaseVideoActivity#mRlDownloadBar");
                af.uef((View) this, (View.OnTouchListener) lwVarLw, "TTBaseVideoActivity#mRlDownloadBar");
                return;
            }
        }
        String str = "VAST_ICON";
        if (!gzwVar.fzf().lw) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.moa.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    View.OnClickListener onClickListener2 = oaVarMoa;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(view);
                    }
                    if (view == null || !"VAST_ICON".equals(view.getTag(570425345))) {
                        if (gzwVar.nkc() != null) {
                            gzwVar.nkc().uef().xs(moa.this.bcc.tpx.cq());
                        }
                    } else {
                        if (gzwVar.nkc() == null || gzwVar.nkc().oa() == null) {
                            return;
                        }
                        gzwVar.nkc().oa().uef(moa.this.bcc.tpx.cq());
                    }
                }
            };
            TextView textView = this.f25444oa;
            if (textView != null) {
                textView.setOnClickListener(onClickListener);
            }
            TextView textView2 = this.lw;
            if (textView2 != null && !TextUtils.isEmpty(textView2.getText())) {
                this.lw.setOnClickListener(onClickListener);
            }
            bs bsVar = this.moa;
            if (bsVar != null) {
                bsVar.setTag(570425345, "VAST_ICON");
                this.moa.setOnClickListener(oaVarMoa);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.yo.xs xsVar = new com.bytedance.sdk.openadsdk.core.yo.xs("VAST_ACTION_BUTTON", gzwVar.nkc(), lwVarLw) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.moa.3
        };
        com.bytedance.sdk.openadsdk.core.yo.xs xsVar2 = new com.bytedance.sdk.openadsdk.core.yo.xs(str, gzwVar.nkc(), lwVarLw) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.moa.4
        };
        TextView textView3 = this.f25444oa;
        if (textView3 != null) {
            textView3.setOnClickListener(xsVar);
            this.f25444oa.setOnTouchListener(xsVar);
        }
        bs bsVar2 = this.moa;
        if (bsVar2 != null) {
            bsVar2.setOnClickListener(xsVar2);
            this.moa.setOnTouchListener(xsVar2);
        }
        TextView textView4 = this.lw;
        if (textView4 == null || TextUtils.isEmpty(textView4.getText())) {
            return;
        }
        this.lw.setOnClickListener(xsVar);
        this.lw.setOnTouchListener(xsVar);
    }

    public void uef() {
        Keyframe keyframeOfFloat = Keyframe.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.65f, 1.0f);
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(0.765f, 0.9f);
        Keyframe keyframeOfFloat4 = Keyframe.ofFloat(0.88f, 1.0f);
        Keyframe keyframeOfFloat5 = Keyframe.ofFloat(0.95f, 0.95f);
        Keyframe keyframeOfFloat6 = Keyframe.ofFloat(1.0f, 1.0f);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("scaleX", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6), PropertyValuesHolder.ofKeyframe("scaleY", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6));
        objectAnimatorOfPropertyValuesHolder.setDuration(1000L);
        objectAnimatorOfPropertyValuesHolder.start();
    }

    public void uef(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
        this.bcc = oaVar;
        if (oaVar.f25412oa.bx() == 1) {
            moa();
        }
    }

    private static Drawable uef(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#1A73E8"));
        gradientDrawable.setCornerRadius(af.oa(context, 18.0f));
        return gradientDrawable;
    }

    private static Drawable oa(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#000000"));
        gradientDrawable.setAlpha(30);
        gradientDrawable.setCornerRadius(af.oa(context, 8.0f));
        return gradientDrawable;
    }

    private static Drawable yo(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#FE2C55"));
        gradientDrawable.setCornerRadius(af.oa(context, 8.0f));
        return gradientDrawable;
    }
}
