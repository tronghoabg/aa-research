.class public final LB/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB/S;


# instance fields
.field public final a:LN/V;

.field public final b:LN/V;

.field public final c:LN/V;


# direct methods
.method public constructor <init>(LN/V;LN/V;LN/V;)V
    .locals 1

    .line 1
    const-string v0, "isPressed"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "isHovered"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "isFocused"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, LB/v;->a:LN/V;

    .line 20
    .line 21
    iput-object p2, p0, LB/v;->b:LN/V;

    .line 22
    .line 23
    iput-object p3, p0, LB/v;->c:LN/V;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final l(Lt0/v;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Lt0/v;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LB/v;->a:LN/V;

    .line 5
    .line 6
    invoke-interface {v0}, LN/K0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p1, Lt0/v;->a:Lg0/b;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    sget-wide v3, Le0/q;->b:J

    .line 21
    .line 22
    const v0, 0x3e99999a    # 0.3f

    .line 23
    .line 24
    .line 25
    invoke-static {v3, v4, v0}, Le0/q;->a(JF)J

    .line 26
    .line 27
    .line 28
    move-result-wide v3

    .line 29
    iget-object v0, v2, Lg0/b;->b:Lba/a;

    .line 30
    .line 31
    invoke-virtual {v0}, Lba/a;->y()J

    .line 32
    .line 33
    .line 34
    move-result-wide v5

    .line 35
    move-wide v2, v3

    .line 36
    move-wide v4, v5

    .line 37
    const/4 v6, 0x0

    .line 38
    const/4 v7, 0x0

    .line 39
    const/16 v8, 0x7a

    .line 40
    .line 41
    move-object v1, p1

    .line 42
    invoke-static/range {v1 .. v8}, Lcom/google/android/gms/internal/consent_sdk/a;->g(Lg0/d;JJFLe0/r;I)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    iget-object v0, p0, LB/v;->b:LN/V;

    .line 47
    .line 48
    invoke-interface {v0}, LN/K0;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_2

    .line 59
    .line 60
    iget-object v0, p0, LB/v;->c:LN/V;

    .line 61
    .line 62
    invoke-interface {v0}, LN/K0;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Ljava/lang/Boolean;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    return-void

    .line 76
    :cond_2
    :goto_0
    sget-wide v0, Le0/q;->b:J

    .line 77
    .line 78
    const v3, 0x3dcccccd    # 0.1f

    .line 79
    .line 80
    .line 81
    invoke-static {v0, v1, v3}, Le0/q;->a(JF)J

    .line 82
    .line 83
    .line 84
    move-result-wide v0

    .line 85
    iget-object v2, v2, Lg0/b;->b:Lba/a;

    .line 86
    .line 87
    invoke-virtual {v2}, Lba/a;->y()J

    .line 88
    .line 89
    .line 90
    move-result-wide v4

    .line 91
    const/4 v6, 0x0

    .line 92
    const/4 v7, 0x0

    .line 93
    const/16 v8, 0x7a

    .line 94
    .line 95
    move-wide v2, v0

    .line 96
    move-object v1, p1

    .line 97
    invoke-static/range {v1 .. v8}, Lcom/google/android/gms/internal/consent_sdk/a;->g(Lg0/d;JJFLe0/r;I)V

    .line 98
    .line 99
    .line 100
    return-void
.end method
