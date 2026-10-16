package com.bytedance.sdk.openadsdk.dz.uef;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.W;
import androidx.recyclerview.widget.m0;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.core.ivm.bcc;
import com.bytedance.sdk.openadsdk.core.ivm.lw;
import com.bytedance.sdk.openadsdk.core.ivm.moa;
import com.bytedance.sdk.openadsdk.utils.af;
import com.unity3d.services.UnityAdsConstants;
import com.wynauto.wyn.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public class oa extends I {
    private InterfaceC0118oa lw;
    private Context uef;

    /* renamed from: oa, reason: collision with root package name */
    private List<Object> f25897oa = new ArrayList();
    private List<com.bytedance.sdk.openadsdk.dz.uef.uef> yo = new ArrayList();
    private List<com.bytedance.sdk.openadsdk.dz.uef.uef> moa = new ArrayList();

    /* renamed from: com.bytedance.sdk.openadsdk.dz.uef.oa$oa, reason: collision with other inner class name */
    public interface InterfaceC0118oa {
        void uef(com.bytedance.sdk.openadsdk.dz.uef.uef uefVar);
    }

    public class uef extends m0 {
        bcc moa;

        /* renamed from: oa, reason: collision with root package name */
        bcc f25899oa;
        moa uef;
        bcc yo;

        public uef(View view) {
            super(view);
            View[] viewArr = (View[]) view.getTag();
            this.uef = (moa) viewArr[0];
            this.f25899oa = (bcc) viewArr[1];
            this.yo = (bcc) viewArr[2];
            this.moa = (bcc) viewArr[3];
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.dz.uef.oa.uef.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    int adapterPosition = uef.this.getAdapterPosition();
                    if (adapterPosition != -1) {
                        Object obj = oa.this.f25897oa.get(adapterPosition);
                        if (obj instanceof com.bytedance.sdk.openadsdk.dz.uef.uef) {
                            oa.this.uef((com.bytedance.sdk.openadsdk.dz.uef.uef) obj);
                        }
                    }
                }
            });
        }

        public void uef(com.bytedance.sdk.openadsdk.dz.uef.uef uefVar) {
            try {
                String strLw = uefVar.lw();
                this.f25899oa.setText(uefVar.moa());
                this.yo.setText(strLw);
                this.moa.setText(new SimpleDateFormat("MMM dd · HH:mm", Locale.US).format(new Date(Long.parseLong(uefVar.ivm()))));
                this.uef.setImageResource(R.drawable.tt_history_placeholder);
                if (TextUtils.isEmpty(strLw)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.zjm.moa.uef(com.bytedance.sdk.openadsdk.dz.uef.uef.yo.uef().uef(strLw)).yo(1).uef(this.uef);
            } catch (Exception e7) {
                dhk.uef("IABHSecAdapter", "bind error: ", e7);
            }
        }
    }

    public class yo extends m0 {
        bcc uef;

        public yo(View view) {
            super(view);
            this.uef = (bcc) view;
        }
    }

    public oa(Context context) {
        this.uef = context.getApplicationContext();
    }

    private lw oa() {
        lw lwVar = new lw(this.uef);
        lwVar.setOrientation(0);
        lwVar.setLayoutParams(new W(-1, uef(84.0f)));
        lwVar.setPadding(uef(16.0f), uef(10.0f), uef(16.0f), uef(10.0f));
        lw lwVar2 = new lw(this.uef);
        lwVar2.setOrientation(1);
        moa moaVar = new moa(this.uef);
        moaVar.setId(View.generateViewId());
        moaVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        moaVar.setAdjustViewBounds(true);
        moaVar.setLayoutParams(new LinearLayout.LayoutParams(uef(64.0f), uef(64.0f)));
        lwVar2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        lwVar2.setPadding(uef(8.0f), uef(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), uef(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), uef(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        bcc bccVar = new bcc(this.uef);
        bccVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int i5 = Build.VERSION.SDK_INT;
        bccVar.setTextAppearance(android.R.style.TextAppearance.Material.Medium);
        Typeface typefaceCreate = i5 >= 28 ? Typeface.create(bccVar.getTypeface(), 500, false) : null;
        if (typefaceCreate != null) {
            bccVar.setTypeface(typefaceCreate);
        }
        bccVar.setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.3f);
        bccVar.setLetterSpacing(0.0067f);
        bccVar.setTextColor(Color.argb(255, 0, 0, 0));
        bccVar.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        bccVar.setEllipsize(truncateAt);
        bccVar.setId(View.generateViewId());
        bccVar.setTextSize(0, uef(14.0f));
        bcc bccVar2 = new bcc(this.uef);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = uef(4.0f);
        bccVar2.setLayoutParams(layoutParams);
        Typeface typefaceCreate2 = i5 >= 28 ? Typeface.create(bccVar.getTypeface(), 400, false) : null;
        if (typefaceCreate2 != null) {
            bccVar2.setTypeface(typefaceCreate2);
        }
        bccVar2.setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.3f);
        bccVar2.setLetterSpacing(0.0067f);
        bccVar2.setTextColor(Color.argb(166, 0, 0, 0));
        bccVar2.setMaxLines(1);
        bccVar2.setEllipsize(truncateAt);
        bccVar2.setId(View.generateViewId());
        bccVar2.setTextSize(0, uef(14.0f));
        bcc bccVar3 = new bcc(this.uef);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = uef(8.0f);
        bccVar3.setLayoutParams(layoutParams2);
        bccVar3.setTextAppearance(android.R.style.TextAppearance.Material.Caption);
        bccVar3.setTextColor(Color.argb(166, 0, 0, 0));
        bccVar3.setId(View.generateViewId());
        Typeface typefaceCreate3 = i5 >= 28 ? Typeface.create(bccVar.getTypeface(), 400, false) : null;
        if (typefaceCreate3 != null) {
            bccVar3.setTypeface(typefaceCreate3);
        }
        bccVar3.setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.3f);
        bccVar3.setLetterSpacing(0.0067f);
        bccVar3.setTextColor(Color.argb(166, 0, 0, 0));
        bccVar3.setMaxLines(1);
        bccVar3.setEllipsize(truncateAt);
        bccVar3.setId(View.generateViewId());
        bccVar3.setTextSize(0, uef(12.0f));
        lwVar.addView(moaVar);
        lwVar.addView(lwVar2);
        lwVar2.addView(bccVar);
        lwVar2.addView(bccVar2);
        lwVar2.addView(bccVar3);
        lwVar.setTag(new View[]{moaVar, bccVar, bccVar2, bccVar3});
        return lwVar;
    }

    @Override // androidx.recyclerview.widget.I
    public int getItemCount() {
        return this.f25897oa.size();
    }

    @Override // androidx.recyclerview.widget.I
    public int getItemViewType(int i5) {
        return this.f25897oa.get(i5) instanceof String ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.I
    public void onBindViewHolder(m0 m0Var, int i5) {
        Object obj = this.f25897oa.get(i5);
        if (m0Var.getItemViewType() == 0) {
            ((yo) m0Var).uef.setText((String) obj);
        } else {
            ((uef) m0Var).uef((com.bytedance.sdk.openadsdk.dz.uef.uef) obj);
        }
    }

    @Override // androidx.recyclerview.widget.I
    public m0 onCreateViewHolder(ViewGroup viewGroup, int i5) {
        if (i5 != 0) {
            return new uef(oa());
        }
        bcc bccVar = new bcc(this.uef);
        bccVar.setPadding(uef(16.0f), uef(8.0f), 0, uef(8.0f));
        bccVar.setTextSize(14.0f);
        int i10 = Build.VERSION.SDK_INT;
        bccVar.setTextAppearance(android.R.style.TextAppearance.Material.Medium);
        Typeface typefaceCreate = i10 >= 28 ? Typeface.create(bccVar.getTypeface(), 500, false) : null;
        if (typefaceCreate != null) {
            bccVar.setTypeface(typefaceCreate);
        }
        bccVar.setTextColor(Color.argb(167, 0, 0, 0));
        bccVar.setLayoutParams(new W(-1, -2));
        return new yo(bccVar);
    }

    public void uef(InterfaceC0118oa interfaceC0118oa) {
        this.lw = interfaceC0118oa;
    }

    public void uef(List<com.bytedance.sdk.openadsdk.dz.uef.uef> list) {
        this.yo.clear();
        this.moa.clear();
        if (list != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - 604800000;
            for (com.bytedance.sdk.openadsdk.dz.uef.uef uefVar : list) {
                try {
                    if (Long.parseLong(uefVar.ivm()) >= jCurrentTimeMillis) {
                        this.yo.add(uefVar);
                    } else {
                        this.moa.add(uefVar);
                    }
                } catch (NumberFormatException unused) {
                    this.yo.add(uefVar);
                }
            }
        }
        uef();
        notifyDataSetChanged();
    }

    private void uef() {
        this.f25897oa.clear();
        if (!this.yo.isEmpty()) {
            List<Object> list = this.f25897oa;
            Context context = this.uef;
            list.add(context.getString(orq.oa(context, "tt_history_this_week")));
            this.f25897oa.addAll(this.yo);
        }
        if (this.moa.isEmpty()) {
            return;
        }
        List<Object> list2 = this.f25897oa;
        Context context2 = this.uef;
        list2.add(context2.getString(orq.oa(context2, "tt_history_a_week_ago")));
        this.f25897oa.addAll(this.moa);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(com.bytedance.sdk.openadsdk.dz.uef.uef uefVar) {
        InterfaceC0118oa interfaceC0118oa = this.lw;
        if (interfaceC0118oa != null) {
            interfaceC0118oa.uef(uefVar);
        }
    }

    private int uef(float f10) {
        return af.oa(this.uef, f10);
    }
}
