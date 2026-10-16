package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.libraries.maps.model.Cap;
import com.google.android.libraries.maps.model.StampStyle;
import com.google.android.projection.gearhead.R;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class zyh {
    public final Object a;
    final Object b;
    final Object c;
    public final Object d;

    public zyh(gjt gjtVar) {
        RelativeLayout relativeLayout = new RelativeLayout(gjtVar.A());
        this.a = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        relativeLayout.setVisibility(8);
        TextView textViewF = f(gjtVar);
        this.b = textViewF;
        int[] iArr = ebm.a;
        textViewF.setId(View.generateViewId());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(21);
        layoutParams.addRule(12);
        layoutParams.setMargins(10, 0, 0, 0);
        layoutParams.setMarginStart(10);
        layoutParams.setMarginEnd(0);
        relativeLayout.addView(textViewF, layoutParams);
        TextView textViewF2 = f(gjtVar);
        this.c = textViewF2;
        textViewF2.setText(gjtVar.F(R.string.report_a_problem));
        textViewF2.setId(View.generateViewId());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(16, textViewF.getId());
        layoutParams2.addRule(12);
        relativeLayout.addView(textViewF2, layoutParams2);
        ImageView imageView = new ImageView(gjtVar.A());
        this.d = imageView;
        imageView.setImageDrawable(gjtVar.D(com.google.android.libraries.maps.R.drawable.maps_watermark_light));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(20);
        layoutParams3.addRule(12);
        int iW = gjtVar.w(R.dimen.maps_watermark_margin);
        layoutParams3.setMargins(iW, iW, iW, iW);
        imageView.setLayoutParams(layoutParams3);
        imageView.setTag("GoogleWatermark");
        relativeLayout.addView(imageView);
        a("");
        if (addy.c()) {
            String upperCase = "H".toUpperCase(Locale.getDefault());
            TextView textViewF3 = f(gjtVar);
            textViewF3.setText(String.format(Locale.getDefault(), "InternalOnly[%s%s%s]", upperCase, upperCase, upperCase));
            textViewF3.setClickable(false);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams4.addRule(16, textViewF2.getId());
            layoutParams4.addRule(12);
            layoutParams4.setMargins(10, 0, 10, 0);
            relativeLayout.addView(textViewF3, layoutParams4);
        }
    }

    public static zyh e(Cap cap, aacq aacqVar) {
        zkt.n(cap, "clientCap");
        zkt.n(aacqVar, "bitmapManager");
        if (cap.getType() != 3) {
            return new zyh(cap, aacqVar, null, null);
        }
        ztq ztqVar = (ztq) sqi.a(cap.getBitmapDescriptor().getRemoteObject());
        aacqVar.i(ztqVar);
        return new zyh(cap, aacqVar, aacqVar.h(ztqVar), ztqVar);
    }

    private static TextView f(gjt gjtVar) {
        TextView textView = new TextView(gjtVar.A());
        textView.setClickable(true);
        textView.setBackgroundColor(-1862270977);
        textView.setTextColor(-16777216);
        textView.setTextSize(10.0f);
        textView.setPadding(5, 0, 5, 0);
        return textView;
    }

    public final void a(String str) {
        TextView textView = (TextView) this.b;
        textView.setText(str);
        textView.setVisibility(true != str.isEmpty() ? 0 : 4);
    }

    public final int b() {
        return ((Cap) this.a).getType();
    }

    public final Float c() {
        return ((Cap) this.a).getBitmapRefWidth();
    }

    public final void d() {
        Object obj = this.b;
        if (obj != null) {
            ((aacq) this.c).j((ztq) obj);
        }
    }

    public zyh(StampStyle stampStyle, aacq aacqVar) {
        zkt.n(stampStyle, "clientStampStyle");
        zkt.n(aacqVar, "bitmapManager");
        this.a = stampStyle;
        this.c = aacqVar;
        ztq ztqVar = (ztq) sqi.a(stampStyle.getStamp().getRemoteObject());
        this.b = ztqVar;
        aacqVar.i(ztqVar);
        this.d = aacqVar.h(ztqVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zyh(com.google.android.libraries.maps.model.Cap r6, defpackage.aacq r7, android.graphics.Bitmap r8, defpackage.ztq r9) {
        /*
            r5 = this;
            r5.<init>()
            java.lang.String r0 = "clientCap"
            defpackage.zkt.n(r6, r0)
            java.lang.String r0 = "bitmapManager"
            defpackage.zkt.n(r7, r0)
            int r0 = r6.getType()
            r1 = 1
            r2 = 0
            r3 = 3
            if (r0 != r3) goto L1f
            if (r8 == 0) goto L1e
            if (r9 != 0) goto L1b
            goto L1e
        L1b:
            r4 = r1
            r0 = r3
            goto L28
        L1e:
            r0 = r3
        L1f:
            if (r0 == r3) goto L27
            if (r8 != 0) goto L27
            if (r9 != 0) goto L27
            r4 = r1
            goto L28
        L27:
            r4 = r2
        L28:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r0
            r3[r1] = r8
            r0 = 2
            r3[r0] = r9
            java.lang.String r0 = "type=%s bitmap=%s descriptor=%s"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            defpackage.zkt.e(r4, r0)
            r5.a = r6
            r5.c = r7
            r5.d = r8
            r5.b = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zyh.<init>(com.google.android.libraries.maps.model.Cap, aacq, android.graphics.Bitmap, ztq):void");
    }
}
