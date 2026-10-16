package androidx.compose.runtime.composer;

import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface GroupSourceInformation {
    boolean getClosed();

    int getDataEndOffset();

    int getDataStartOffset();

    ArrayList<Object> getGroups();

    int getKey();

    String getSourceInformation();
}
