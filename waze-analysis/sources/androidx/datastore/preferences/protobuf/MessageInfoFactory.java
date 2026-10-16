package androidx.datastore.preferences.protobuf;

/* compiled from: WazeSource */
@CheckReturnValue
/* loaded from: classes3.dex */
interface MessageInfoFactory {
    boolean isSupported(Class<?> cls);

    MessageInfo messageInfoFor(Class<?> cls);
}
