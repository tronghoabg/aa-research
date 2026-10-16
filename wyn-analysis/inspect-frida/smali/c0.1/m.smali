.class public abstract Lc0/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La2/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lc0/b;->l:Lc0/b;

    .line 2
    .line 3
    invoke-static {v0}, Lff/B;->G(Ltf/a;)La2/v;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lc0/m;->a:La2/v;

    .line 8
    .line 9
    return-void
.end method

.method public static final a(Lc0/g;)V
    .locals 5

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lc0/g;->k:Lt0/y;

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v2, p0, Lc0/g;->i:Lc0/l;

    .line 12
    .line 13
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    iput-boolean v0, v2, Lc0/l;->a:Z

    .line 18
    .line 19
    sget-object v0, Lc0/o;->b:Lc0/o;

    .line 20
    .line 21
    const-string v3, "<set-?>"

    .line 22
    .line 23
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, v2, Lc0/l;->b:Lc0/o;

    .line 27
    .line 28
    iput-object v0, v2, Lc0/l;->c:Lc0/o;

    .line 29
    .line 30
    iput-object v0, v2, Lc0/l;->d:Lc0/o;

    .line 31
    .line 32
    iput-object v0, v2, Lc0/l;->e:Lc0/o;

    .line 33
    .line 34
    iput-object v0, v2, Lc0/l;->f:Lc0/o;

    .line 35
    .line 36
    iput-object v0, v2, Lc0/l;->g:Lc0/o;

    .line 37
    .line 38
    iput-object v0, v2, Lc0/l;->h:Lc0/o;

    .line 39
    .line 40
    iput-object v0, v2, Lc0/l;->i:Lc0/o;

    .line 41
    .line 42
    iget-object v0, v1, Lt0/y;->e:Lt0/t;

    .line 43
    .line 44
    iget-object v0, v0, Lt0/t;->g:Lu0/n;

    .line 45
    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    invoke-virtual {v0}, Lu0/n;->getSnapshotObserver()Lt0/K;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    sget-object v1, Lc0/f;->i:Lc0/f;

    .line 55
    .line 56
    new-instance v3, Lc0/i;

    .line 57
    .line 58
    const/4 v4, 0x1

    .line 59
    invoke-direct {v3, p0, v4}, Lc0/i;-><init>(Lc0/g;I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p0, v1, v3}, Lt0/K;->a(Lt0/J;Ltf/l;Ltf/a;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    iget-boolean v0, v2, Lc0/l;->a:Z

    .line 66
    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    invoke-static {p0}, Lxg/g;->i(Lc0/g;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_2
    invoke-static {p0}, Lxg/g;->w(Lc0/g;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method
