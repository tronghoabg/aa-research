package androidx.work.impl.model;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface WorkNameDao {
    List<String> getNamesForWorkSpecId(String str);

    List<String> getWorkSpecIdsWithName(String str);

    void insert(WorkName workName);
}
