package com.google.mlkit.vision.text.bundled.common;

import Da.a;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboc;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbom;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

@DynamiteApi
/* loaded from: classes4.dex */
public class BundledTextRecognizerCreator extends zboc {
    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbod
    public a newTextRecognizer(InterfaceC3876a interfaceC3876a) throws RemoteException {
        throw new RemoteException("Please use newTextRecognizerWithOptions instead.");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbod
    public a newTextRecognizerWithOptions(InterfaceC3876a interfaceC3876a, zbom zbomVar) {
        Context context = (Context) BinderC3877b.S(interfaceC3876a);
        AbstractC1732v.i(context);
        return new a(context, zbomVar.zba(), zbomVar.zbc(), zbomVar.zbb(), zbomVar.zbd());
    }
}
