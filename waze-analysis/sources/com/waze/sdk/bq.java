package com.waze.sdk;

import android.app.ActivityOptions;
import android.app.Dialog;
import android.app.PendingIntent;
import android.os.Build;
import android.util.Base64;
import com.waze.ConfigManager;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.dc;
import java.security.NoSuchAlgorithmException;
import javax.crypto.KeyGenerator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class bq {
    public /* synthetic */ bq(byte[] bArr) {
    }

    static String a() throws NoSuchAlgorithmException {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128);
            return Base64.encodeToString(keyGenerator.generateKey().getEncoded(), 0);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static boolean b(PendingIntent pendingIntent) {
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                pendingIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
            } else {
                pendingIntent.send();
            }
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    static Dialog c(String str, com.waze.ab.q qVar) {
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        String strC = aVarA.c(R.string.AUDIO_SDK_DATA_SHARING_BODY_PS_PS, str, ConfigManager.getInstance().getConfigValueString(ConfigValues.CONFIG_VALUE_AUDIO_EXTENSION_DATA_SHARING_MORE_INFO_URL));
        com.waze.ab.o oVar = new com.waze.ab.o();
        oVar.Q(aVarA.c(R.string.AUDIO_SDK_DATA_SHARING_TITLE_PS, str));
        oVar.P(strC);
        oVar.f13808a = new dc(qVar, 12);
        oVar.M(aVarA.c(R.string.AUDIO_SDK_DATA_SHARING_ACCEPT, new Object[0]));
        oVar.N(aVarA.c(R.string.AUDIO_SDK_DATA_SHARING_DECLINE, new Object[0]));
        oVar.y(false);
        return com.waze.z.a.d.ai.q(oVar);
    }

    public static /* synthetic */ i.b.s d(com.waze.shared_infra.h.c cVar) {
        i.b.p pVarNewBuilder = i.b.s.newBuilder();
        pVarNewBuilder.a(cVar.c());
        pVarNewBuilder.b(cVar.d());
        i.b.s sVarBuild = pVarNewBuilder.build();
        h.g.b.x.e(sVarBuild, "build(...)");
        return sVarBuild;
    }

    private bq() {
        throw null;
    }
}
