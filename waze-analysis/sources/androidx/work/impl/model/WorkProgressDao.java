package androidx.work.impl.model;

import androidx.work.Data;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface WorkProgressDao {
    void delete(String str);

    void deleteAll();

    Data getProgressForWorkSpecId(String str);

    void insert(WorkProgress workProgress);
}
