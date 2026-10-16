package com.bytedance.adsdk.oa.yo.yo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.adsdk.oa.dhk;
import com.bytedance.adsdk.oa.zjm;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class yo extends moa {
    private LinearLayout bcc;
    private final LinearLayout.LayoutParams cz;
    private final List<TextView> dj;
    private String wrv;
    private final List<String> zjm;

    public yo(com.bytedance.adsdk.oa.cz czVar, lw lwVar, Context context) {
        List<zjm.uef> listYo;
        super(czVar, lwVar);
        this.cz = new LinearLayout.LayoutParams(-2, -2);
        this.zjm = new ArrayList();
        this.dj = new ArrayList();
        com.bytedance.adsdk.oa.zjm zjmVar = ((moa) this).xs;
        if (zjmVar == null || (listYo = zjmVar.yo()) == null || listYo.size() <= 0) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.bcc = linearLayout;
        int i5 = 0;
        linearLayout.setOrientation(0);
        oa(listYo.get(0).xs);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(80);
        this.bcc.addView(linearLayout2);
        List<String> listWrv = wrv();
        while (i5 < listYo.size()) {
            zjm.uef uefVar = listYo.get(i5);
            TextView textView = new TextView(context);
            uef(textView, uefVar, (listWrv == null || i5 >= listWrv.size()) ? "" : listWrv.get(i5));
            int i10 = uefVar.ivm;
            if (i10 != 0) {
                this.cz.bottomMargin = (int) (com.bytedance.adsdk.oa.ivm.ivm.uef() * i10);
                linearLayout2.addView(textView, this.cz);
            } else {
                linearLayout2.addView(textView);
            }
            i5++;
        }
        float fUef = com.bytedance.adsdk.oa.ivm.ivm.uef();
        uef(this.bcc, (int) (((moa) this).xs.uef() * fUef), (int) (((moa) this).xs.oa() * fUef));
    }

    private void oa(String str) {
        if (TextUtils.isEmpty(str)) {
            this.bcc.setGravity(17);
            return;
        }
        str.getClass();
        if (str.equals("left")) {
            this.bcc.setGravity(3);
        } else if (str.equals("right")) {
            this.bcc.setGravity(5);
        } else {
            this.bcc.setGravity(17);
        }
    }

    private void uef(TextView textView, zjm.uef uefVar, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setText("");
        } else {
            textView.setText(str);
        }
        if (!TextUtils.isEmpty(uefVar.yo)) {
            textView.setTextColor(Color.parseColor(uefVar.yo));
        }
        if (!TextUtils.isEmpty(uefVar.moa)) {
            textView.setBackgroundColor(Color.parseColor(uefVar.moa));
        }
        textView.setGravity(17);
        textView.setTextSize(uefVar.lw);
    }

    private List<String> wrv() {
        com.bytedance.adsdk.oa.cz czVar;
        dhk dhkVarGsd;
        List<zjm.uef> listYo;
        if (((moa) this).xs == null || (czVar = this.f24651oa) == null || (dhkVarGsd = czVar.gsd()) == null) {
            return null;
        }
        String strMoa = ((moa) this).xs.moa();
        if ((!TextUtils.isEmpty(strMoa) || !TextUtils.isEmpty(this.wrv)) && (listYo = ((moa) this).xs.yo()) != null) {
            String strUef = this.wrv;
            if (TextUtils.isEmpty(strUef)) {
                strUef = dhkVarGsd.uef(strMoa);
            }
            if (!TextUtils.isEmpty(strUef)) {
                int length = strUef.length();
                this.zjm.clear();
                for (int i5 = 0; i5 < listYo.size(); i5++) {
                    zjm.uef uefVar = listYo.get(i5);
                    int iMax = uefVar.uef;
                    int iMax2 = uefVar.f24655oa;
                    if (iMax < 0) {
                        iMax = Math.max(iMax + length, 0);
                    }
                    if (iMax2 < 0) {
                        iMax2 = Math.max(iMax2 + length, 0);
                    }
                    if (iMax + iMax2 > length) {
                        this.zjm.add("");
                    } else {
                        if (listYo.size() == 1 && iMax == 0 && iMax2 == 0) {
                            iMax2 = length;
                        }
                        this.zjm.add(strUef.substring(iMax, iMax2 + iMax));
                    }
                }
                return this.zjm;
            }
        }
        return null;
    }

    private void yo(float f10) {
        List<zjm.uef> listYo;
        com.bytedance.adsdk.oa.zjm zjmVar = ((moa) this).xs;
        if (zjmVar == null || (listYo = zjmVar.yo()) == null || listYo.size() <= 0) {
            return;
        }
        this.bcc.setOrientation(0);
        this.bcc.setGravity(17);
        if (this.bcc.getChildCount() <= 0) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) this.bcc.getChildAt(0);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(80);
        this.bcc.removeAllViews();
        if (linearLayout.getChildCount() != listYo.size()) {
            return;
        }
        List<String> listWrv = wrv();
        this.dj.clear();
        int i5 = 0;
        while (i5 < listYo.size()) {
            zjm.uef uefVar = listYo.get(i5);
            TextView textView = (TextView) linearLayout.getChildAt(i5);
            this.dj.add(textView);
            uef(textView, uefVar, (listWrv == null || i5 >= listWrv.size()) ? "" : listWrv.get(i5));
            i5++;
        }
        linearLayout.removeAllViews();
        for (int i10 = 0; i10 < listYo.size(); i10++) {
            zjm.uef uefVar2 = listYo.get(i10);
            TextView textView2 = this.dj.get(i10);
            textView2.setAlpha(f10);
            linearLayout.setAlpha(f10);
            int i11 = uefVar2.ivm;
            if (i11 != 0) {
                this.cz.bottomMargin = (int) (com.bytedance.adsdk.oa.ivm.ivm.uef() * i11);
                linearLayout.addView(textView2, this.cz);
            } else {
                linearLayout.addView(textView2);
            }
        }
        this.bcc.setAlpha(f10);
        this.bcc.addView(linearLayout);
        float fUef = com.bytedance.adsdk.oa.ivm.ivm.uef();
        uef(this.bcc, (int) (((moa) this).xs.uef() * fUef), (int) (((moa) this).xs.oa() * fUef));
    }

    @Override // com.bytedance.adsdk.oa.yo.yo.moa, com.bytedance.adsdk.oa.yo.yo.uef
    public void oa(Canvas canvas, Matrix matrix, int i5) {
        if (this.bcc != null) {
            canvas.save();
            canvas.concat(matrix);
            uef(i5);
            yo(ivm());
            this.bcc.draw(canvas);
            canvas.restore();
            return;
        }
        super.oa(canvas, matrix, i5);
    }

    private static void uef(View view, int i5, int i10) {
        view.layout(0, 0, i5, i10);
        view.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void uef(String str) {
        this.wrv = str;
    }
}
