package R8;

import com.qonversion.android.sdk.internal.Constants;
import com.qonversion.android.sdk.internal.logger.QExceptionManager;
import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes4.dex */
public final /* synthetic */ class h implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10460a;

    public /* synthetic */ h(int i5) {
        this.f10460a = i5;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f10460a) {
            case 0:
                return str.startsWith("aqs.");
            case 1:
                return str.startsWith(".ae");
            case 2:
                return str.startsWith("event");
            case 3:
                return str.startsWith("event") && !str.endsWith(Constants.USER_ID_SEPARATOR);
            default:
                return QExceptionManager.getAvailableReportNames$lambda$3(file, str);
        }
    }
}
