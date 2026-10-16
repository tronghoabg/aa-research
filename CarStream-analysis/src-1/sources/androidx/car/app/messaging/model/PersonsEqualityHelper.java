package androidx.car.app.messaging.model;

import androidx.core.app.Person;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u000b"}, d2 = {"Landroidx/car/app/messaging/model/PersonsEqualityHelper;", "", "()V", "arePersonsEqual", "", "person1", "Landroidx/core/app/Person;", "person2", "getPersonHashCode", "", "person", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PersonsEqualityHelper {
    public static final PersonsEqualityHelper INSTANCE = new PersonsEqualityHelper();

    private PersonsEqualityHelper() {
    }

    @JvmStatic
    public static final boolean arePersonsEqual(Person person1, Person person2) {
        if (person1 == null && person2 == null) {
            return true;
        }
        if (person1 == null || person2 == null) {
            return false;
        }
        String key = person1.getKey();
        String key2 = person2.getKey();
        return (key == null && key2 == null) ? Intrinsics.areEqual(Objects.toString(person1.getName()), Objects.toString(person2.getName())) && Intrinsics.areEqual(person1.getUri(), person2.getUri()) && person1.isBot() == person2.isBot() && person1.isImportant() == person2.isImportant() : Intrinsics.areEqual(key, key2);
    }

    @JvmStatic
    public static final int getPersonHashCode(Person person) {
        if (person == null) {
            return 0;
        }
        String key = person.getKey();
        return key != null ? key.hashCode() : Objects.hash(person.getName(), person.getUri(), Boolean.valueOf(person.isBot()), Boolean.valueOf(person.isImportant()));
    }
}
