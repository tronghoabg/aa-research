package androidx.car.app.model;

import androidx.car.app.annotations.RequiresCarApi;

/* compiled from: WazeSource */
@RequiresCarApi(2)
/* loaded from: classes2.dex */
public interface InputCallback {
    void onInputSubmitted(String str);

    void onInputTextChanged(String str);

    /* compiled from: WazeSource */
    /* renamed from: androidx.car.app.model.InputCallback$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onInputSubmitted(InputCallback inputCallback, String str) {
        }

        public static void $default$onInputTextChanged(InputCallback inputCallback, String str) {
        }
    }
}
