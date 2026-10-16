package com.google.android.apps.auto.components.feedback.hats;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.projection.gearhead.R;
import defpackage.ep;
import defpackage.er;
import defpackage.vuf;
import defpackage.yph;
import defpackage.yx;
import java.lang.ref.WeakReference;
import org.chromium.net.CronetEngine;

/* loaded from: classes2.dex */
public class HatsSurveyActivity extends ep {
    public static final yph m = yph.c("GH.HatsSurveyAct");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0339 A[Catch: all -> 0x0697, TryCatch #0 {, blocks: (B:17:0x00e3, B:19:0x010b, B:28:0x0120, B:35:0x0143, B:32:0x013c, B:33:0x0141, B:24:0x0117, B:25:0x011c, B:36:0x0155, B:38:0x015b, B:40:0x0163, B:41:0x016a, B:42:0x0176, B:44:0x0178, B:46:0x017c, B:48:0x018a, B:50:0x019f, B:52:0x01c2, B:53:0x01d8, B:55:0x01da, B:67:0x0233, B:69:0x0239, B:70:0x0250, B:72:0x0252, B:74:0x0258, B:75:0x0270, B:77:0x0272, B:79:0x0277, B:90:0x02c8, B:91:0x02d7, B:80:0x027f, B:82:0x0287, B:84:0x02a0, B:85:0x02af, B:87:0x02b3, B:89:0x02b9, B:93:0x02d9, B:95:0x02ea, B:97:0x02f0, B:99:0x02f4, B:100:0x02f6, B:114:0x0335, B:116:0x0339, B:117:0x033b, B:121:0x034d, B:126:0x0363, B:127:0x0372, B:122:0x0354, B:123:0x035a, B:124:0x035b, B:106:0x030b, B:107:0x0311, B:108:0x0312, B:111:0x0321, B:112:0x0333, B:109:0x0319, B:129:0x0374, B:131:0x039e, B:134:0x03a9, B:136:0x03af, B:138:0x03bc, B:140:0x0408, B:141:0x040e, B:142:0x041a, B:144:0x0422, B:146:0x042d, B:148:0x0435, B:149:0x0438, B:153:0x0447, B:152:0x0440, B:154:0x047b, B:156:0x0481, B:161:0x0497, B:163:0x04a3, B:165:0x04a7, B:166:0x04a9, B:168:0x04ad, B:244:0x0586, B:245:0x0592, B:170:0x04b7, B:171:0x04bd, B:173:0x04c3, B:178:0x04d5, B:184:0x04e0, B:204:0x050d, B:205:0x051b, B:210:0x0525, B:212:0x052a, B:214:0x0531, B:219:0x053d, B:221:0x0545, B:223:0x054c, B:243:0x0577, B:222:0x054a, B:213:0x052f, B:248:0x0598, B:249:0x05d1, B:251:0x05d4, B:253:0x05dd, B:254:0x05f7, B:256:0x05fa, B:258:0x060b, B:260:0x0677, B:261:0x0680, B:259:0x0670, B:159:0x0490, B:160:0x0495, B:132:0x03a5, B:58:0x01e7, B:64:0x021b, B:65:0x0231, B:61:0x01fc, B:63:0x020e, B:49:0x018d, B:263:0x0682, B:264:0x0696), top: B:270:0x00e3, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x035b A[Catch: all -> 0x0697, TryCatch #0 {, blocks: (B:17:0x00e3, B:19:0x010b, B:28:0x0120, B:35:0x0143, B:32:0x013c, B:33:0x0141, B:24:0x0117, B:25:0x011c, B:36:0x0155, B:38:0x015b, B:40:0x0163, B:41:0x016a, B:42:0x0176, B:44:0x0178, B:46:0x017c, B:48:0x018a, B:50:0x019f, B:52:0x01c2, B:53:0x01d8, B:55:0x01da, B:67:0x0233, B:69:0x0239, B:70:0x0250, B:72:0x0252, B:74:0x0258, B:75:0x0270, B:77:0x0272, B:79:0x0277, B:90:0x02c8, B:91:0x02d7, B:80:0x027f, B:82:0x0287, B:84:0x02a0, B:85:0x02af, B:87:0x02b3, B:89:0x02b9, B:93:0x02d9, B:95:0x02ea, B:97:0x02f0, B:99:0x02f4, B:100:0x02f6, B:114:0x0335, B:116:0x0339, B:117:0x033b, B:121:0x034d, B:126:0x0363, B:127:0x0372, B:122:0x0354, B:123:0x035a, B:124:0x035b, B:106:0x030b, B:107:0x0311, B:108:0x0312, B:111:0x0321, B:112:0x0333, B:109:0x0319, B:129:0x0374, B:131:0x039e, B:134:0x03a9, B:136:0x03af, B:138:0x03bc, B:140:0x0408, B:141:0x040e, B:142:0x041a, B:144:0x0422, B:146:0x042d, B:148:0x0435, B:149:0x0438, B:153:0x0447, B:152:0x0440, B:154:0x047b, B:156:0x0481, B:161:0x0497, B:163:0x04a3, B:165:0x04a7, B:166:0x04a9, B:168:0x04ad, B:244:0x0586, B:245:0x0592, B:170:0x04b7, B:171:0x04bd, B:173:0x04c3, B:178:0x04d5, B:184:0x04e0, B:204:0x050d, B:205:0x051b, B:210:0x0525, B:212:0x052a, B:214:0x0531, B:219:0x053d, B:221:0x0545, B:223:0x054c, B:243:0x0577, B:222:0x054a, B:213:0x052f, B:248:0x0598, B:249:0x05d1, B:251:0x05d4, B:253:0x05dd, B:254:0x05f7, B:256:0x05fa, B:258:0x060b, B:260:0x0677, B:261:0x0680, B:259:0x0670, B:159:0x0490, B:160:0x0495, B:132:0x03a5, B:58:0x01e7, B:64:0x021b, B:65:0x0231, B:61:0x01fc, B:63:0x020e, B:49:0x018d, B:263:0x0682, B:264:0x0696), top: B:270:0x00e3, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0363 A[Catch: all -> 0x0697, TryCatch #0 {, blocks: (B:17:0x00e3, B:19:0x010b, B:28:0x0120, B:35:0x0143, B:32:0x013c, B:33:0x0141, B:24:0x0117, B:25:0x011c, B:36:0x0155, B:38:0x015b, B:40:0x0163, B:41:0x016a, B:42:0x0176, B:44:0x0178, B:46:0x017c, B:48:0x018a, B:50:0x019f, B:52:0x01c2, B:53:0x01d8, B:55:0x01da, B:67:0x0233, B:69:0x0239, B:70:0x0250, B:72:0x0252, B:74:0x0258, B:75:0x0270, B:77:0x0272, B:79:0x0277, B:90:0x02c8, B:91:0x02d7, B:80:0x027f, B:82:0x0287, B:84:0x02a0, B:85:0x02af, B:87:0x02b3, B:89:0x02b9, B:93:0x02d9, B:95:0x02ea, B:97:0x02f0, B:99:0x02f4, B:100:0x02f6, B:114:0x0335, B:116:0x0339, B:117:0x033b, B:121:0x034d, B:126:0x0363, B:127:0x0372, B:122:0x0354, B:123:0x035a, B:124:0x035b, B:106:0x030b, B:107:0x0311, B:108:0x0312, B:111:0x0321, B:112:0x0333, B:109:0x0319, B:129:0x0374, B:131:0x039e, B:134:0x03a9, B:136:0x03af, B:138:0x03bc, B:140:0x0408, B:141:0x040e, B:142:0x041a, B:144:0x0422, B:146:0x042d, B:148:0x0435, B:149:0x0438, B:153:0x0447, B:152:0x0440, B:154:0x047b, B:156:0x0481, B:161:0x0497, B:163:0x04a3, B:165:0x04a7, B:166:0x04a9, B:168:0x04ad, B:244:0x0586, B:245:0x0592, B:170:0x04b7, B:171:0x04bd, B:173:0x04c3, B:178:0x04d5, B:184:0x04e0, B:204:0x050d, B:205:0x051b, B:210:0x0525, B:212:0x052a, B:214:0x0531, B:219:0x053d, B:221:0x0545, B:223:0x054c, B:243:0x0577, B:222:0x054a, B:213:0x052f, B:248:0x0598, B:249:0x05d1, B:251:0x05d4, B:253:0x05dd, B:254:0x05f7, B:256:0x05fa, B:258:0x060b, B:260:0x0677, B:261:0x0680, B:259:0x0670, B:159:0x0490, B:160:0x0495, B:132:0x03a5, B:58:0x01e7, B:64:0x021b, B:65:0x0231, B:61:0x01fc, B:63:0x020e, B:49:0x018d, B:263:0x0682, B:264:0x0696), top: B:270:0x00e3, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0595 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0525 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A(android.content.Intent r27) {
        /*
            Method dump skipped, instructions count: 1719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.components.feedback.hats.HatsSurveyActivity.A(android.content.Intent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        if (er.b != 2) {
            er.b = 2;
            synchronized (er.g) {
                yx yxVar = new yx(er.f);
                while (yxVar.hasNext()) {
                    er erVar = (er) ((WeakReference) yxVar.next()).get();
                    if (erVar != null) {
                        erVar.q();
                    }
                }
            }
        }
        super.onCreate(bundle);
        setContentView(R.layout.hats_survey);
        vuf.M(this, new CronetEngine.Builder(this).build());
        A(getIntent());
    }

    @Override // defpackage.ob, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        A(intent);
    }
}
