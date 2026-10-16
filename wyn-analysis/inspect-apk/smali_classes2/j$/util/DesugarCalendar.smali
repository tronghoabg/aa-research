.class public final synthetic Lj$/util/DesugarCalendar;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final toInstant(Ljava/util/Calendar;)Lj$/time/Instant;
    .locals 2

    .line 3674
    invoke-virtual {p0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lj$/time/Instant;->V(J)Lj$/time/Instant;

    move-result-object p0

    return-object p0
.end method
