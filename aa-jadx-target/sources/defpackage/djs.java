package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class djs extends defpackage.djr {
    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(android.view.inputmethod.HandwritingGesture handwritingGesture, java.util.concurrent.Executor executor, java.util.function.IntConsumer intConsumer) {
        android.view.inputmethod.InputConnection inputConnection = this.a;
        if (inputConnection != null) {
            axd$.ExternalSyntheticApiModelOutline0.m(inputConnection, handwritingGesture, executor, intConsumer);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(android.view.inputmethod.PreviewableHandwritingGesture previewableHandwritingGesture, android.os.CancellationSignal cancellationSignal) {
        android.view.inputmethod.InputConnection inputConnection = this.a;
        if (inputConnection != null) {
            return axd$.ExternalSyntheticApiModelOutline0.m(inputConnection, previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }
}
