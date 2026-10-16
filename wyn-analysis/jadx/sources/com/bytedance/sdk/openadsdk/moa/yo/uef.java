package com.bytedance.sdk.openadsdk.moa.yo;

import com.applovin.sdk.AppLovinWebViewActivity;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.qonversion.android.sdk.internal.Constants;

/* loaded from: classes3.dex */
public class uef {

    /* renamed from: com.bytedance.sdk.openadsdk.moa.yo.uef$uef, reason: collision with other inner class name */
    public interface InterfaceC0128uef {
        public static final String ivm;
        public static final String lw;
        public static final String moa;

        /* renamed from: oa, reason: collision with root package name */
        public static final String f26043oa;
        public static final String uef;
        public static final String yo;

        static {
            CharSequence[] charSequenceArr = {gb.ku(), "load_start"};
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequenceArr[0]);
            sb2.append((CharSequence) Constants.USER_ID_SEPARATOR);
            sb2.append(charSequenceArr[1]);
            uef = sb2.toString();
            CharSequence[] charSequenceArr2 = {gb.ku(), "load_finish"};
            StringBuilder sb3 = new StringBuilder();
            sb3.append(charSequenceArr2[0]);
            sb3.append((CharSequence) Constants.USER_ID_SEPARATOR);
            sb3.append(charSequenceArr2[1]);
            f26043oa = sb3.toString();
            CharSequence[] charSequenceArr3 = {gb.ku(), AppLovinWebViewActivity.INTENT_EXTRA_KEY_LOAD_URL};
            StringBuilder sb4 = new StringBuilder();
            sb4.append(charSequenceArr3[0]);
            sb4.append((CharSequence) Constants.USER_ID_SEPARATOR);
            sb4.append(charSequenceArr3[1]);
            yo = sb4.toString();
            CharSequence[] charSequenceArr4 = {gb.ku(), gb.cp()};
            StringBuilder sb5 = new StringBuilder();
            sb5.append(charSequenceArr4[0]);
            sb5.append((CharSequence) Constants.USER_ID_SEPARATOR);
            sb5.append(charSequenceArr4[1]);
            moa = sb5.toString();
            CharSequence[] charSequenceArr5 = {gb.ku(), gb.cp(), "show"};
            StringBuilder sb6 = new StringBuilder();
            sb6.append(charSequenceArr5[0]);
            for (int i5 = 1; i5 < 3; i5++) {
                sb6.append((CharSequence) Constants.USER_ID_SEPARATOR);
                sb6.append(charSequenceArr5[i5]);
            }
            lw = sb6.toString();
            CharSequence[] charSequenceArr6 = {gb.ku(), gb.cp(), "progress"};
            StringBuilder sb7 = new StringBuilder();
            sb7.append(charSequenceArr6[0]);
            for (int i10 = 1; i10 < 3; i10++) {
                sb7.append((CharSequence) Constants.USER_ID_SEPARATOR);
                sb7.append(charSequenceArr6[i10]);
            }
            ivm = sb7.toString();
        }
    }
}
