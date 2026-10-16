package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.tooling.LocationSourceInformation;
import androidx.compose.runtime.tooling.ParameterSourceInformation;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class SourceInformationContext {
    private final boolean isCall;
    private final boolean isInline;
    private final List<LocationSourceInformation> locations;
    private final String name;
    private int nextLocation;
    private final int packageHash;
    private final List<ParameterSourceInformation> parameters;
    private final int repeatOffset;
    private final String sourceFile;

    public SourceInformationContext(String str, String str2, int i2, List<LocationSourceInformation> list, int i3, List<ParameterSourceInformation> list2, boolean z, boolean z2) {
        this.name = str;
        this.sourceFile = str2;
        this.packageHash = i2;
        this.locations = list;
        this.repeatOffset = i3;
        this.parameters = list2;
        this.isCall = z;
        this.isInline = z2;
    }

    public final List<LocationSourceInformation> getLocations() {
        return this.locations;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPackageHash() {
        return this.packageHash;
    }

    public final List<ParameterSourceInformation> getParameters() {
        return this.parameters;
    }

    public final int getRepeatOffset() {
        return this.repeatOffset;
    }

    public final String getSourceFile() {
        return this.sourceFile;
    }

    public final boolean isCall() {
        return this.isCall;
    }

    public final boolean isInline() {
        return this.isInline;
    }

    public final SourceLocation nextSourceLocation() {
        int i2;
        if (this.nextLocation >= this.locations.size() && (i2 = this.repeatOffset) >= 0) {
            this.nextLocation = i2;
        }
        if (this.nextLocation >= this.locations.size()) {
            return null;
        }
        List<LocationSourceInformation> list = this.locations;
        int i3 = this.nextLocation;
        this.nextLocation = i3 + 1;
        LocationSourceInformation locationSourceInformation = list.get(i3);
        return new SourceLocation(locationSourceInformation.getLineNumber(), locationSourceInformation.getOffset(), locationSourceInformation.getLength(), this.sourceFile, this.packageHash);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.tooling.data.SourceLocation sourceLocation(int r9, androidx.compose.ui.tooling.data.SourceInformationContext r10) {
        /*
            r8 = this;
            java.util.List<androidx.compose.runtime.tooling.LocationSourceInformation> r0 = r8.locations
            int r0 = r0.size()
            if (r9 < r0) goto L22
            int r0 = r8.repeatOffset
            if (r0 < 0) goto L22
            java.util.List<androidx.compose.runtime.tooling.LocationSourceInformation> r1 = r8.locations
            int r1 = r1.size()
            if (r0 >= r1) goto L22
            int r0 = r8.repeatOffset
            int r9 = r9 - r0
            java.util.List<androidx.compose.runtime.tooling.LocationSourceInformation> r1 = r8.locations
            int r1 = r1.size()
            int r1 = r1 - r0
            int r0 = r8.repeatOffset
            int r9 = r9 % r1
            int r9 = r9 + r0
        L22:
            java.util.List<androidx.compose.runtime.tooling.LocationSourceInformation> r0 = r8.locations
            int r0 = r0.size()
            r1 = 0
            if (r9 >= r0) goto L68
            java.util.List<androidx.compose.runtime.tooling.LocationSourceInformation> r0 = r8.locations
            java.lang.Object r9 = r0.get(r9)
            androidx.compose.runtime.tooling.LocationSourceInformation r9 = (androidx.compose.runtime.tooling.LocationSourceInformation) r9
            androidx.compose.ui.tooling.data.SourceLocation r2 = new androidx.compose.ui.tooling.data.SourceLocation
            int r3 = r9.getLineNumber()
            int r4 = r9.getOffset()
            int r5 = r9.getLength()
            java.lang.String r9 = r8.sourceFile
            if (r9 != 0) goto L4d
            if (r10 == 0) goto L4b
            java.lang.String r0 = r10.sourceFile
            r6 = r0
            goto L4e
        L4b:
            r6 = r1
            goto L4e
        L4d:
            r6 = r9
        L4e:
            if (r9 != 0) goto L55
            if (r10 == 0) goto L5b
            int r8 = r10.packageHash
            goto L57
        L55:
            int r8 = r8.packageHash
        L57:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
        L5b:
            if (r1 == 0) goto L62
            int r8 = r1.intValue()
            goto L63
        L62:
            r8 = -1
        L63:
            r7 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.tooling.data.SourceInformationContext.sourceLocation(int, androidx.compose.ui.tooling.data.SourceInformationContext):androidx.compose.ui.tooling.data.SourceLocation");
    }
}
