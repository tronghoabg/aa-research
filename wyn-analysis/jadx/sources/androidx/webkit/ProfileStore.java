package androidx.webkit;

import java.util.List;
import x3.InterfaceC4459b;

/* loaded from: classes.dex */
public interface ProfileStore {
    boolean deleteProfile(String str);

    List<String> getAllProfileNames();

    InterfaceC4459b getOrCreateProfile(String str);

    InterfaceC4459b getProfile(String str);
}
