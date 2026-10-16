package X0;

import android.app.Notification;
import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public abstract class H {
    public static void a(Notification.Builder builder, Person person) {
        builder.addPerson(person);
    }

    public static Q b(Person person) {
        CharSequence name = person.getName();
        IconCompat iconCompatD = person.getIcon() != null ? IconCompat.d(person.getIcon()) : null;
        String uri = person.getUri();
        String key = person.getKey();
        boolean zIsBot = person.isBot();
        boolean zIsImportant = person.isImportant();
        Q q4 = new Q();
        q4.f15813a = name;
        q4.f15814b = iconCompatD;
        q4.f15815c = uri;
        q4.f15816d = key;
        q4.f15817e = zIsBot;
        q4.f15818f = zIsImportant;
        return q4;
    }

    public static void c(Notification.Action.Builder builder, int i5) {
        builder.setSemanticAction(i5);
    }

    public static Person d(Q q4) {
        Person.Builder name = new Person.Builder().setName(q4.f15813a);
        IconCompat iconCompat = q4.f15814b;
        return name.setIcon(iconCompat != null ? iconCompat.j(null) : null).setUri(q4.f15815c).setKey(q4.f15816d).setBot(q4.f15817e).setImportant(q4.f15818f).build();
    }
}
