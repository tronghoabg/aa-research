package com.waze.reports;

import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.media3.common.PlaybackException;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.gas.GasNativeManager;
import com.waze.navigate.DriveToNativeManager;
import com.waze.navigate.NearbyStation;
import com.waze.navigate.Product;
import com.waze.resources.ResourcesNativeManager;
import com.waze.sharedui.views.AutoResizeTextView;
import com.waze.sharedui.views.WazeSwitchView;
import com.waze.view.anim.SliderSeparator;
import com.waze.view.button.ReportMenuButton;
import com.waze.view.text.WazeEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.a.ava;
import l.a.avc;
import l.a.xx;
import l.a.xy;
import l.a.xz;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class GasPriceReportActivity extends com.waze.ifs.ui.a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f33545f = 0;
    private String[] B;
    private boolean[] C;
    private String[] D;
    private LinearLayout E;
    private Product F;

    /* renamed from: h, reason: collision with root package name */
    private NativeManager f33547h;

    /* renamed from: k, reason: collision with root package name */
    private DriveToNativeManager f33548k;
    private NearbyStation o;
    private View q;
    private SliderSeparator r;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f33546g = com.waze.shared_infra.i.a.d("GasPriceReportActivity");

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f33549l = com.waze.shared_infra.o.b.a();
    private final List m = new ArrayList();
    private final List n = new ArrayList();
    private int p = -1;
    private char s = '.';
    private int[] t = null;
    private int[] u = null;
    private String[] v = null;
    private boolean z = false;
    private final List A = new ArrayList();

    public static /* synthetic */ void E(GasPriceReportActivity gasPriceReportActivity, int i2) throws NumberFormatException {
        float[] fArr = new float[i2];
        int[] iArr = new int[i2];
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < i2; i3++) {
            String string = ((WazeEditText) ((View) gasPriceReportActivity.m.get(i3)).findViewById(R.id.gasPriceItemEdit)).getText().toString();
            if (string.isEmpty()) {
                fArr[i3] = -1.0f;
                iArr[i3] = 2;
                if (Float.compare(gasPriceReportActivity.F.prices[i3], 0.0f) != 0) {
                    z = true;
                    z2 = true;
                }
            } else {
                boolean z3 = !(Float.compare(gasPriceReportActivity.F.prices[i3], 0.0f) != 0);
                z2 |= z3;
                z |= z3;
                try {
                    float f2 = Float.parseFloat(string.replace(Character.toString(gasPriceReportActivity.s), "."));
                    fArr[i3] = f2;
                    if (Float.compare(f2, gasPriceReportActivity.F.prices[i3]) == 0) {
                        iArr[i3] = 0;
                    } else {
                        try {
                            iArr[i3] = 1;
                            z2 = true;
                        } catch (Exception unused) {
                            z2 = true;
                            fArr[i3] = 0.0f;
                            iArr[i3] = 0;
                        }
                    }
                } catch (Exception unused2) {
                }
            }
        }
        T(xx.CONFIRM, z, z2);
        gasPriceReportActivity.f33547h.OpenProgressPopup(gasPriceReportActivity.f33549l.c(R.string.SENDING_UPDATEPPP, new Object[0]));
        ((GasNativeManager) com.waze.web.r.h(GasNativeManager.class)).setUpdateHandler(NativeManager.UH_GAS_PRICE_UPDATED, gasPriceReportActivity.y);
        gasPriceReportActivity.f33548k.setProductPrices(gasPriceReportActivity.o.index, fArr, iArr, i2);
    }

    public static /* synthetic */ void H(GasPriceReportActivity gasPriceReportActivity) {
        T(xx.CLOSE, false, false);
        gasPriceReportActivity.finish();
    }

    public static /* synthetic */ void I(GasPriceReportActivity gasPriceReportActivity) {
        T(xx.BACK, false, false);
        gasPriceReportActivity.finish();
    }

    public static /* synthetic */ void K(GasPriceReportActivity gasPriceReportActivity) {
        Iterator it = gasPriceReportActivity.m.iterator();
        while (it.hasNext()) {
            ((View) it.next()).findViewById(R.id.gasPriceItemEdit).clearFocus();
        }
    }

    public static /* synthetic */ void L(GasPriceReportActivity gasPriceReportActivity, View view) {
        if (view == gasPriceReportActivity.findViewById(R.id.reportGasAvailableSwitch)) {
            return;
        }
        gasPriceReportActivity.R(false);
        int i2 = 0;
        while (true) {
            List list = gasPriceReportActivity.m;
            if (i2 >= list.size()) {
                return;
            }
            View view2 = (View) list.get(i2);
            if (view2.findViewById(R.id.gasPriceItemEdit) == view) {
                gasPriceReportActivity.p = i2;
                if (i2 == -1) {
                    gasPriceReportActivity.P();
                } else {
                    View viewFindViewById = gasPriceReportActivity.findViewById(R.id.reportGasEditLeft);
                    View viewFindViewById2 = gasPriceReportActivity.findViewById(R.id.reportGasEditRight);
                    if (gasPriceReportActivity.p == 0) {
                        viewFindViewById.setEnabled(false);
                        viewFindViewById.setAlpha(0.3f);
                    } else {
                        viewFindViewById.setEnabled(true);
                        viewFindViewById.setAlpha(1.0f);
                        viewFindViewById.setOnClickListener(new com.waze.mywaze.f(gasPriceReportActivity, 9));
                    }
                    if (gasPriceReportActivity.p == gasPriceReportActivity.v.length - 1) {
                        viewFindViewById2.setEnabled(false);
                        viewFindViewById2.setAlpha(0.3f);
                    } else {
                        viewFindViewById2.setEnabled(true);
                        viewFindViewById2.setAlpha(1.0f);
                        viewFindViewById2.setOnClickListener(new com.waze.mywaze.f(gasPriceReportActivity, 10));
                    }
                }
                gasPriceReportActivity.S(view2);
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N() {
        int i2 = this.p;
        if (i2 == -1) {
            return;
        }
        ((View) this.m.get(i2)).findViewById(R.id.gasPriceItemEdit).clearFocus();
        R(true);
        P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O() {
        setResult(PlaybackException.ERROR_CODE_DECODER_INIT_FAILED);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P() {
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(findViewById(android.R.id.content).getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(int i2) {
        R(false);
        this.p = i2;
        List list = this.m;
        View viewFindViewById = ((View) list.get(i2)).findViewById(R.id.gasPriceItemEdit);
        viewFindViewById.requestFocus();
        S((View) list.get(i2));
        ((InputMethodManager) getSystemService("input_method")).showSoftInput(viewFindViewById, 0);
    }

    private final void R(boolean z) {
        int i2 = this.p;
        if (i2 == -1) {
            return;
        }
        WazeEditText wazeEditText = (WazeEditText) ((View) this.m.get(i2)).findViewById(R.id.gasPriceItemEdit);
        wazeEditText.setTextColor(getResources().getColor(R.color.content_default));
        if (wazeEditText.length() > 0) {
            String string = wazeEditText.getText().toString();
            char c2 = this.s;
            String[] strArrSplit = string.split(c2 == '.' ? "\\." : Character.toString(c2));
            if (this.u[this.p] != 0) {
                if (strArrSplit.length == 1) {
                    string = strArrSplit[0] + this.s;
                    for (int i3 = 0; i3 < this.u[this.p]; i3++) {
                        string = string.concat("0");
                    }
                } else {
                    string = strArrSplit[0] + this.s + strArrSplit[1];
                    for (int length = strArrSplit[1].length(); length < this.u[this.p]; length++) {
                        string = string.concat("0");
                    }
                }
            }
            int length2 = string.length();
            int[] iArr = this.t;
            int i4 = this.p;
            if (length2 < iArr[i4] + this.u[i4] + 1 + this.v[i4].length()) {
                string = String.valueOf(string).concat(String.valueOf(this.v[this.p]));
            }
            List list = this.A;
            wazeEditText.removeTextChangedListener((TextWatcher) list.get(this.p));
            wazeEditText.setText(string);
            wazeEditText.addTextChangedListener((TextWatcher) list.get(this.p));
        }
        this.p = -1;
        if (z) {
            findViewById(R.id.reportGasFocusDummy).requestFocus();
        }
    }

    private final void S(View view) {
        WazeEditText wazeEditText = (WazeEditText) view.findViewById(R.id.gasPriceItemEdit);
        wazeEditText.setTextColor(getResources().getColor(R.color.hint_text));
        wazeEditText.setCursorVisible(false);
        wazeEditText.post(new com.waze.g.f(wazeEditText, 7));
        WazeSwitchView wazeSwitchView = (WazeSwitchView) findViewById(R.id.reportGasAvailableSwitch);
        wazeSwitchView.b(!wazeEditText.getText().toString().isEmpty());
        wazeSwitchView.a(new bg(this, wazeEditText, 0));
        wazeSwitchView.setOnClickListener(new com.waze.mywaze.f(wazeSwitchView, 4));
        wazeEditText.getLocationOnScreen(new int[2]);
        SliderSeparator sliderSeparator = this.r;
        if (sliderSeparator != null) {
            sliderSeparator.a(r1[0] + (wazeEditText.getWidth() / 2.0f));
        }
    }

    private static final void T(xx xxVar, boolean z, boolean z2) {
        xy xyVarNewBuilder = xz.newBuilder();
        xyVarNewBuilder.a(xxVar);
        if (xxVar == xx.CONFIRM) {
            xyVarNewBuilder.b(z);
            xyVarNewBuilder.c(z2);
        }
        ava avaVarNewBuilder = avc.newBuilder();
        avaVarNewBuilder.o(xyVarNewBuilder.build());
        com.waze.sharedui.utils.o.C(com.waze.stats.ax.f40550a.a(), avaVarNewBuilder.build());
    }

    public static /* synthetic */ h.ab q(final GasPriceReportActivity gasPriceReportActivity, Product product) {
        int i2;
        String strB;
        List list;
        int i3;
        String strB2;
        int i4;
        int length;
        List listU;
        List listSubList;
        List listX;
        List listSubList2;
        List listX2;
        List listSubList3;
        if (product == null) {
            com.waze.shared_infra.i.h.c("GasPriceReportActivity.onResult product==null");
        } else {
            int iMin = Math.min(product.prices.length, ConfigValues.CONFIG_VALUE_GAS_PRICES_MAX_GAS_TYPES_LIMIT.b().intValue());
            h.g.b.x.f(product, "<this>");
            String str = product.providerId;
            String str2 = product.venueId;
            String str3 = product.name;
            String[] strArr = product.labels;
            int i5 = 0;
            String[] strArr2 = (strArr == null || (listX2 = h.a.c.X(strArr)) == null || (listSubList3 = listX2.subList(0, Math.min(iMin, product.labels.length))) == null) ? null : (String[]) listSubList3.toArray(new String[0]);
            String[] strArr3 = product.formats;
            String[] strArr4 = (strArr3 == null || (listX = h.a.c.X(strArr3)) == null || (listSubList2 = listX.subList(0, Math.min(iMin, product.formats.length))) == null) ? null : (String[]) listSubList2.toArray(new String[0]);
            float[] fArr = product.prices;
            gasPriceReportActivity.F = new Product(str, str2, str3, strArr2, strArr4, (fArr == null || (listU = h.a.c.U(fArr)) == null || (listSubList = listU.subList(0, Math.min(iMin, product.prices.length))) == null) ? null : h.a.i.az(listSubList), product.lastUpdated, product.updatedBy, product.currency);
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(gasPriceReportActivity);
            int i6 = 0;
            while (true) {
                i2 = 3;
                if (i6 >= iMin) {
                    break;
                }
                View viewInflate = layoutInflaterFrom.inflate(R.layout.gas_price_item, (ViewGroup) gasPriceReportActivity.E, false);
                gasPriceReportActivity.E.addView(viewInflate);
                gasPriceReportActivity.m.add(viewInflate);
                gasPriceReportActivity.n.add(null);
                WazeEditText wazeEditText = (WazeEditText) viewInflate.findViewById(R.id.gasPriceItemEdit);
                wazeEditText.setRawInputType(3);
                wazeEditText.a();
                wazeEditText.setHint(gasPriceReportActivity.f33549l.c(R.string.GAS_PRICES_UNAVAILABLE, new Object[0]));
                wazeEditText.setCustomSelectionActionModeCallback(new bh(gasPriceReportActivity));
                bk bkVar = new bk(gasPriceReportActivity, wazeEditText);
                gasPriceReportActivity.A.add(bkVar);
                wazeEditText.addTextChangedListener(bkVar);
                i6++;
            }
            ReportMenuButton reportMenuButton = (ReportMenuButton) gasPriceReportActivity.findViewById(R.id.reportCloseButton);
            reportMenuButton.e(gasPriceReportActivity.getResources().getDrawable(R.drawable.icon_report_gas));
            reportMenuButton.setBackgroundColor(-9719662);
            reportMenuButton.h();
            TextView textView = (TextView) gasPriceReportActivity.findViewById(R.id.reportGasEdit);
            com.waze.shared_infra.o.a aVar = gasPriceReportActivity.f33549l;
            textView.setText(aVar.c(R.string.GAS_PRICES_EDIT, new Object[0]));
            gasPriceReportActivity.findViewById(R.id.reportGasEditBtn).setOnClickListener(new com.waze.mywaze.f(gasPriceReportActivity, 5));
            com.waze.mywaze.c cVar = new com.waze.mywaze.c(gasPriceReportActivity, iMin, 1);
            ((TextView) gasPriceReportActivity.findViewById(R.id.reportGasSend)).setText(aVar.c(R.string.GAS_PRICES_SEND, new Object[0]));
            gasPriceReportActivity.findViewById(R.id.reportGasSendBtn).setOnClickListener(cVar);
            ((TextView) gasPriceReportActivity.findViewById(R.id.reportGasEditSubmit)).setText(aVar.c(R.string.GAS_PRICES_SUBMIT, new Object[0]));
            gasPriceReportActivity.findViewById(R.id.reportGasSubmitBtn).setOnClickListener(cVar);
            ((TextView) gasPriceReportActivity.findViewById(R.id.reportGasAvailableLabel)).setText(aVar.c(R.string.GAS_PRICES_AVAILABLE, new Object[0]));
            gasPriceReportActivity.findViewById(android.R.id.content).setOnClickListener(new com.waze.mywaze.f(gasPriceReportActivity, 6));
            gasPriceReportActivity.findViewById(R.id.reportGasPriceBack).setOnClickListener(new com.waze.mywaze.f(gasPriceReportActivity, 7));
            gasPriceReportActivity.findViewById(R.id.reportGasPriceClose).setOnClickListener(new com.waze.mywaze.f(gasPriceReportActivity, 8));
            gasPriceReportActivity.r = (SliderSeparator) gasPriceReportActivity.findViewById(R.id.reportGasKeyboardFooterSeparator);
            int length2 = gasPriceReportActivity.D.length;
            if (length2 <= iMin) {
                iMin = length2;
            }
            int i7 = 0;
            while (true) {
                if (i7 >= iMin) {
                    break;
                }
                if (gasPriceReportActivity.D[i7] == null) {
                    iMin = i7;
                    break;
                }
                i7++;
            }
            gasPriceReportActivity.t = new int[iMin];
            gasPriceReportActivity.u = new int[iMin];
            gasPriceReportActivity.v = new String[iMin];
            int i8 = 0;
            while (true) {
                strB = "";
                if (i8 >= iMin) {
                    break;
                }
                gasPriceReportActivity.t[i8] = 2;
                gasPriceReportActivity.u[i8] = 1;
                gasPriceReportActivity.v[i8] = "";
                String[] strArr5 = gasPriceReportActivity.D;
                if (strArr5 == null || i8 >= strArr5.length) {
                    i4 = i5;
                } else {
                    String[] strArrSplit = strArr5[i8].split("\\#+");
                    int length3 = strArrSplit.length;
                    if (length3 > 1) {
                        char cCharAt = strArrSplit[1].charAt(i5);
                        gasPriceReportActivity.s = cCharAt;
                        i4 = i5;
                        String[] strArrSplit2 = gasPriceReportActivity.D[i8].split("\\" + cCharAt);
                        int length4 = strArrSplit2.length;
                        if (length4 != 2) {
                            gasPriceReportActivity.f33546g.b("Too few or too many digit groups: " + length4);
                        } else {
                            gasPriceReportActivity.t[i8] = strArrSplit2[i4].length();
                            int[] iArr = gasPriceReportActivity.u;
                            int length5 = strArrSplit2[1].length();
                            if (length3 == 3) {
                                length = strArrSplit[2].length();
                                length3 = 3;
                            } else {
                                length = i4;
                            }
                            iArr[i8] = length5 - length;
                            if (length3 > 2) {
                                gasPriceReportActivity.v[i8] = strArrSplit[2];
                            } else {
                                gasPriceReportActivity.v[i8] = "";
                            }
                        }
                    } else {
                        i4 = i5;
                        gasPriceReportActivity.s = '#';
                        gasPriceReportActivity.t[i8] = gasPriceReportActivity.D.length;
                        gasPriceReportActivity.u[i8] = i4;
                    }
                }
                i8++;
                i5 = i4;
            }
            int i9 = i5;
            gasPriceReportActivity.setVisible(true);
            ((TextView) gasPriceReportActivity.findViewById(R.id.reportTitle)).setText(gasPriceReportActivity.o.result);
            String str4 = gasPriceReportActivity.o.icon;
            if (str4 != null && !str4.isEmpty()) {
                gasPriceReportActivity.findViewById(R.id.reportCloseButton).setVisibility(8);
                View viewFindViewById = gasPriceReportActivity.findViewById(R.id.reportLogoFrameRectangle);
                viewFindViewById.setVisibility(i9);
                viewFindViewById.setOnClickListener(new com.waze.mywaze.f(gasPriceReportActivity, i2));
                ((ImageView) gasPriceReportActivity.findViewById(R.id.reportLogoRectangle)).setImageDrawable(ResourcesNativeManager.getInstance().getSkinDrawable(gasPriceReportActivity.getResources(), String.valueOf(gasPriceReportActivity.o.icon).concat(".png")));
            }
            gasPriceReportActivity.findViewById(R.id.reportGasRoot).setVisibility(0);
            String strC = aVar.c(R.string.GAS_PRICES, new Object[0]);
            String str5 = gasPriceReportActivity.F.currency;
            if (str5 != null && !str5.isEmpty()) {
                strC = strC + " (" + aVar.b(str5) + ")";
            }
            ((TextView) gasPriceReportActivity.findViewById(R.id.reportSubTitle)).setText(strC);
            bi biVar = new bi(gasPriceReportActivity);
            gasPriceReportActivity.z = true;
            int i10 = 0;
            while (true) {
                list = gasPriceReportActivity.m;
                if (i10 >= list.size()) {
                    break;
                }
                View view = (View) list.get(i10);
                WazeEditText wazeEditText2 = (WazeEditText) view.findViewById(R.id.gasPriceItemEdit);
                AutoResizeTextView autoResizeTextView = (AutoResizeTextView) view.findViewById(R.id.gasPriceItemLabel);
                view.findViewById(R.id.gasPriceItemIndicator).setVisibility(8);
                Product product2 = gasPriceReportActivity.F;
                float f2 = product2.prices[i10];
                if (f2 > 0.0f) {
                    wazeEditText2.setText(com.waze.shared_infra.q.m.e(product2.formats[i10], f2).replace(',', gasPriceReportActivity.s).replace('.', gasPriceReportActivity.s));
                } else {
                    wazeEditText2.setText("");
                }
                autoResizeTextView.setText(gasPriceReportActivity.F.labels[i10]);
                autoResizeTextView.c(biVar);
                i10++;
            }
            if (gasPriceReportActivity.B != null) {
                gasPriceReportActivity.z = true;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((WazeEditText) ((View) list.get(i11)).findViewById(R.id.gasPriceItemEdit)).setText(gasPriceReportActivity.B[i11]);
                    ((View) list.get(i11)).findViewById(R.id.gasPriceItemIndicator).setVisibility(true != gasPriceReportActivity.C[i11] ? 8 : 0);
                }
                gasPriceReportActivity.B = null;
                gasPriceReportActivity.C = null;
            }
            gasPriceReportActivity.z = false;
            TextView textView2 = (TextView) gasPriceReportActivity.findViewById(R.id.reportGasPriceUserUpdated);
            ReportMenuButton reportMenuButton2 = (ReportMenuButton) gasPriceReportActivity.findViewById(R.id.reportGasPriceUserRmb);
            Product product3 = gasPriceReportActivity.F;
            if (product3.lastUpdated == -1 || product3.updatedBy.isEmpty()) {
                textView2.setVisibility(4);
                reportMenuButton2.setVisibility(4);
            } else {
                Product product4 = gasPriceReportActivity.F;
                String str6 = product4.updatedBy;
                int i12 = product4.lastUpdated;
                if (str6 == null) {
                    strB2 = strB;
                    i3 = 0;
                    textView2.setVisibility(i3);
                    textView2.setText(strB2);
                    reportMenuButton2.setVisibility(i3);
                    int iA = com.waze.utils.e.a(gasPriceReportActivity.F.updatedBy);
                    reportMenuButton2.h();
                    reportMenuButton2.f(R.drawable.happy);
                    reportMenuButton2.setBackgroundColor(iA);
                } else {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                    long jCurrentTimeMillis = ((System.currentTimeMillis() / 1000) - i12) / 86400;
                    com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
                    if (jCurrentTimeMillis == 1) {
                        i3 = 0;
                        strB2 = new h.n.l("<USER>").b(aVarA.c(R.string.LAST_UPDATE_YESTERDAY_FORMAT, new Object[0]), str6);
                    } else if (jCurrentTimeMillis > 0) {
                        strB = new h.n.l("<USER>").b(new h.n.l("<DAYS>").b(aVarA.c(R.string.LAST_UPDATE_DAYS_FORMAT, new Object[0]), String.valueOf(jCurrentTimeMillis)), str6);
                        strB2 = strB;
                        i3 = 0;
                    } else {
                        i3 = 0;
                        strB2 = new h.n.l("<USER>").b(aVarA.c(R.string.LAST_UPDATE_TODAY_FORMAT, new Object[0]), str6);
                    }
                    textView2.setVisibility(i3);
                    textView2.setText(strB2);
                    reportMenuButton2.setVisibility(i3);
                    int iA2 = com.waze.utils.e.a(gasPriceReportActivity.F.updatedBy);
                    reportMenuButton2.h();
                    reportMenuButton2.f(R.drawable.happy);
                    reportMenuButton2.setBackgroundColor(iA2);
                }
            }
            View viewFindViewById2 = gasPriceReportActivity.findViewById(android.R.id.content);
            gasPriceReportActivity.q = viewFindViewById2;
            viewFindViewById2.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: com.waze.reports.bf
                @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
                public final void onGlobalFocusChanged(View view2, View view3) {
                    GasPriceReportActivity.L(this.f33688a, view3);
                }
            });
            gasPriceReportActivity.q.getViewTreeObserver().addOnGlobalLayoutListener(new bj(gasPriceReportActivity));
            gasPriceReportActivity.q.setOnClickListener(new com.waze.mywaze.f(gasPriceReportActivity, 11));
            gasPriceReportActivity.N();
        }
        return h.ab.f48028a;
    }

    public static /* synthetic */ void r(GasPriceReportActivity gasPriceReportActivity) {
        gasPriceReportActivity.f33547h.CloseProgressPopup();
        gasPriceReportActivity.O();
    }

    public static /* synthetic */ void s(GasPriceReportActivity gasPriceReportActivity, WazeEditText wazeEditText, boolean z) {
        if (!z) {
            gasPriceReportActivity.n.set(gasPriceReportActivity.p, wazeEditText.getText().toString());
            wazeEditText.setText("");
            return;
        }
        int i2 = gasPriceReportActivity.p;
        if (i2 != -1) {
            List list = gasPriceReportActivity.n;
            if (list.get(i2) != null) {
                wazeEditText.setText((CharSequence) list.get(gasPriceReportActivity.p));
                list.set(gasPriceReportActivity.p, null);
                gasPriceReportActivity.Q(gasPriceReportActivity.p);
            }
        }
    }

    @Override // com.waze.sharedui.a.e
    public final boolean D(Message message) {
        if (message.what != NativeManager.UH_GAS_PRICE_UPDATED) {
            return false;
        }
        ((GasNativeManager) com.waze.web.r.h(GasNativeManager.class)).unsetUpdateHandler(NativeManager.UH_GAS_PRICE_UPDATED, this.y);
        Bundle data = message.getData();
        String string = data.getString(GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        String string2 = data.getString("text");
        boolean z = data.getBoolean(GasNativeManager.KEY_GAS_PRICE_UPDATE_SUCCEEDED);
        NativeManager nativeManager = this.f33547h;
        int i2 = 1;
        if (z) {
            if (true == TextUtils.isEmpty(string)) {
                string = string2;
            }
            nativeManager.closeAndOpenProgressPopup(string, R.drawable.sign_up_big_v);
            aG(new com.waze.g.f(this, 6), 2000L);
        } else {
            nativeManager.CloseProgressPopup();
            com.waze.ab.o oVar = new com.waze.ab.o();
            oVar.Q(string);
            oVar.P(string2);
            oVar.w(5);
            oVar.J(new com.waze.cf.c.h(this, i2));
            oVar.M(this.f33549l.c(R.string.CLOSE, new Object[0]));
            com.waze.z.a.d.ai.q(oVar);
        }
        return true;
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    public final void onCreate(Bundle bundle) {
        aE();
        super.onCreate(bundle);
        setVisible(false);
        setContentView(R.layout.report_gas_price_content);
        this.E = (LinearLayout) findViewById(R.id.reportGasPrices);
        findViewById(R.id.reportGasRoot).setVisibility(8);
        this.o = (NearbyStation) getIntent().getParcelableExtra("nearby_stations");
        this.D = getIntent().getStringArrayExtra("format_strings");
        if (this.o == null) {
            this.f33546g.b("Start gas report without a gas station!");
            finish();
            return;
        }
        this.f33547h = NativeManager.getInstance();
        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class);
        this.f33548k = driveToNativeManager;
        driveToNativeManager.getProduct(this.o.index, new com.waze.car_lib.screens.am(this, 13));
        com.waze.search.stats.s.f36105a.a().i();
        com.waze.shared_infra.g.e.d(findViewById(R.id.reportGasRoot), findViewById(R.id.reportGasFullscreenFooter));
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        this.z = true;
        super.onRestoreInstanceState(bundle);
        this.z = false;
        this.B = (String[]) bundle.getSerializable("prices");
        this.C = (boolean[]) bundle.getSerializable("modified");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Serializable, java.lang.String[]] */
    @Override // androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        List list = this.m;
        if (list != null) {
            ?? r1 = new String[list.size()];
            boolean[] zArr = new boolean[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                r1[i2] = ((WazeEditText) ((View) list.get(i2)).findViewById(R.id.gasPriceItemEdit)).getText().toString();
                zArr[i2] = ((View) list.get(i2)).findViewById(R.id.gasPriceItemIndicator).getVisibility() == 0;
            }
            bundle.putSerializable("prices", r1);
            bundle.putSerializable("modified", zArr);
        }
        super.onSaveInstanceState(bundle);
    }
}
