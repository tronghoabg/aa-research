package androidx.media3.datasource;

import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class DataSourceException extends IOException {

    @Deprecated
    public static final int POSITION_OUT_OF_RANGE = 2008;
    public final int reason;

    public DataSourceException(int i2) {
        this.reason = i2;
    }

    public static boolean isCausedByPositionOutOfRange(IOException iOException) {
        for (IOException cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).reason == 2008) {
                return true;
            }
        }
        return false;
    }

    public DataSourceException(String str, int i2) {
        super(str);
        this.reason = i2;
    }

    public DataSourceException(String str, Throwable th, int i2) {
        super(str, th);
        this.reason = i2;
    }

    public DataSourceException(Throwable th, int i2) {
        super(th);
        this.reason = i2;
    }
}
