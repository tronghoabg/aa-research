.class public final Lt5/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh9/e;


# static fields
.field public static final a:Lt5/g;

.field public static final b:Lh9/d;

.field public static final c:Lh9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lt5/g;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lt5/g;->a:Lt5/g;

    .line 7
    .line 8
    new-instance v0, Lk9/a;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lk9/a;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const-class v1, Lk9/e;

    .line 15
    .line 16
    invoke-static {v1, v0}, Lpd/f;->m(Ljava/lang/Class;Lk9/a;)Ljava/util/HashMap;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v2, Lh9/d;

    .line 21
    .line 22
    invoke-static {v0}, Lpd/f;->n(Ljava/util/HashMap;)Ljava/util/Map;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v3, "startMs"

    .line 27
    .line 28
    invoke-direct {v2, v3, v0}, Lh9/d;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 29
    .line 30
    .line 31
    sput-object v2, Lt5/g;->b:Lh9/d;

    .line 32
    .line 33
    new-instance v0, Lk9/a;

    .line 34
    .line 35
    const/4 v2, 0x2

    .line 36
    invoke-direct {v0, v2}, Lk9/a;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-static {v1, v0}, Lpd/f;->m(Ljava/lang/Class;Lk9/a;)Ljava/util/HashMap;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v1, Lh9/d;

    .line 44
    .line 45
    invoke-static {v0}, Lpd/f;->n(Ljava/util/HashMap;)Ljava/util/Map;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-string v2, "endMs"

    .line 50
    .line 51
    invoke-direct {v1, v2, v0}, Lh9/d;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 52
    .line 53
    .line 54
    sput-object v1, Lt5/g;->c:Lh9/d;

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Lw5/g;

    .line 2
    .line 3
    check-cast p2, Lh9/f;

    .line 4
    .line 5
    iget-wide v0, p1, Lw5/g;->a:J

    .line 6
    .line 7
    sget-object v2, Lt5/g;->b:Lh9/d;

    .line 8
    .line 9
    invoke-interface {p2, v2, v0, v1}, Lh9/f;->add(Lh9/d;J)Lh9/f;

    .line 10
    .line 11
    .line 12
    sget-object v0, Lt5/g;->c:Lh9/d;

    .line 13
    .line 14
    iget-wide v1, p1, Lw5/g;->b:J

    .line 15
    .line 16
    invoke-interface {p2, v0, v1, v2}, Lh9/f;->add(Lh9/d;J)Lh9/f;

    .line 17
    .line 18
    .line 19
    return-void
.end method
