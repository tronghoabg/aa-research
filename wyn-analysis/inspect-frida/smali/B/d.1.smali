.class public final LB/d;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# instance fields
.field public final synthetic i:F

.field public final synthetic j:Le0/E;

.field public final synthetic k:Le0/m;


# direct methods
.method public constructor <init>(FLe0/E;Le0/m;)V
    .locals 0

    .line 1
    iput p1, p0, LB/d;->i:F

    .line 2
    .line 3
    iput-object p2, p0, LB/d;->j:Le0/E;

    .line 4
    .line 5
    iput-object p3, p0, LB/d;->k:Le0/m;

    .line 6
    .line 7
    const/4 p1, 0x3

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, LZ/k;

    .line 2
    .line 3
    check-cast p2, LN/o;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    const-string p3, "$this$composed"

    .line 11
    .line 12
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const p3, -0x594b0591

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2, p3}, LN/o;->M(I)V

    .line 19
    .line 20
    .line 21
    const p3, -0x1d58f75c

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2, p3}, LN/o;->M(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    sget-object v0, LN/k;->a:LN/P;

    .line 32
    .line 33
    if-ne p3, v0, :cond_0

    .line 34
    .line 35
    new-instance p3, Lt0/M;

    .line 36
    .line 37
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2, p3}, LN/o;->U(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    const/4 v0, 0x0

    .line 44
    invoke-virtual {p2, v0}, LN/o;->p(Z)V

    .line 45
    .line 46
    .line 47
    check-cast p3, Lt0/M;

    .line 48
    .line 49
    sget-object v1, LZ/i;->a:LZ/i;

    .line 50
    .line 51
    new-instance v2, LB/c;

    .line 52
    .line 53
    iget-object v3, p0, LB/d;->k:Le0/m;

    .line 54
    .line 55
    iget v4, p0, LB/d;->i:F

    .line 56
    .line 57
    iget-object v5, p0, LB/d;->j:Le0/E;

    .line 58
    .line 59
    invoke-direct {v2, v4, v5, p3, v3}, LB/c;-><init>(FLe0/E;Lt0/M;Le0/m;)V

    .line 60
    .line 61
    .line 62
    new-instance p3, LG/f;

    .line 63
    .line 64
    const/4 v3, 0x1

    .line 65
    invoke-direct {p3, v2, v3}, LG/f;-><init>(Ljava/lang/Object;I)V

    .line 66
    .line 67
    .line 68
    invoke-static {v1, p3}, Lr7/e;->n(LZ/k;Ltf/q;)LZ/k;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    invoke-interface {p1, p3}, LZ/k;->g(LZ/k;)LZ/k;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p2, v0}, LN/o;->p(Z)V

    .line 77
    .line 78
    .line 79
    return-object p1
.end method
