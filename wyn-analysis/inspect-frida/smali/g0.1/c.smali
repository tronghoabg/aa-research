.class public abstract Lg0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LL0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LL0/c;

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    invoke-direct {v0, v1, v1}, LL0/c;-><init>(FF)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lg0/c;->a:LL0/c;

    .line 9
    .line 10
    return-void
.end method

.method public static a(Lt0/v;JFJI)V
    .locals 7

    .line 1
    and-int/lit8 p6, p6, 0x4

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    iget-object p4, p0, Lt0/v;->a:Lg0/b;

    .line 6
    .line 7
    invoke-virtual {p4}, Lg0/b;->x()J

    .line 8
    .line 9
    .line 10
    move-result-wide p4

    .line 11
    :cond_0
    sget-object v3, Lg0/f;->b:Lg0/f;

    .line 12
    .line 13
    iget-object v0, p0, Lt0/v;->a:Lg0/b;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const-string p0, "style"

    .line 19
    .line 20
    invoke-static {v3, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object p0, v0, Lg0/b;->a:Lg0/a;

    .line 24
    .line 25
    iget-object p0, p0, Lg0/a;->c:Le0/o;

    .line 26
    .line 27
    const/high16 v4, 0x3f800000    # 1.0f

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x3

    .line 31
    move-wide v1, p1

    .line 32
    invoke-static/range {v0 .. v6}, Lg0/b;->a(Lg0/b;JLg0/c;FLe0/r;I)Lc7/l;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-interface {p0, p3, p4, p5, p1}, Le0/o;->k(FJLc7/l;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method
