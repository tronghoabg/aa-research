package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.ParserException;
import androidx.media3.extractor.SniffFailure;
import com.google.d.d.bn;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class UnrecognizedInputFormatException extends ParserException {
    public final bn<SniffFailure> sniffFailures;
    public final Uri uri;

    public UnrecognizedInputFormatException(String str, Uri uri, List<? extends SniffFailure> list) {
        super(str, null, false, 1);
        this.uri = uri;
        this.sniffFailures = bn.n(list);
    }

    @Override // androidx.media3.common.ParserException, java.lang.Throwable
    public String getMessage() {
        bn<SniffFailure> bnVar = this.sniffFailures;
        String message = super.getMessage();
        if (bnVar.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + String.valueOf(this.sniffFailures);
    }

    @Deprecated
    public UnrecognizedInputFormatException(String str, Uri uri) {
        this(str, uri, bn.p());
    }
}
