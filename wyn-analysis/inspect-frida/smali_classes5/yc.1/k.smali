.class public final synthetic Lyc/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lmd/J;

.field public final synthetic b:Ljava/lang/Integer;

.field public final synthetic c:Ljava/lang/Integer;

.field public final synthetic d:Ljava/lang/Boolean;

.field public final synthetic e:Ljava/lang/Boolean;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Lmd/J;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyc/k;->a:Lmd/J;

    iput-object p2, p0, Lyc/k;->b:Ljava/lang/Integer;

    iput-object p3, p0, Lyc/k;->c:Ljava/lang/Integer;

    iput-object p4, p0, Lyc/k;->d:Ljava/lang/Boolean;

    iput-object p5, p0, Lyc/k;->e:Ljava/lang/Boolean;

    iput p6, p0, Lyc/k;->f:I

    iput p7, p0, Lyc/k;->g:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, Lyc/k;->a:Lmd/J;

    .line 2
    .line 3
    iget-object v1, p0, Lyc/k;->b:Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Integer;->doubleValue()D

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lyc/k;->c:Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Integer;->doubleValue()D

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    new-instance v3, Lyc/B;

    .line 24
    .line 25
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v1, v3, Lyc/B;->a:Ljava/lang/Double;

    .line 29
    .line 30
    iput-object v2, v3, Lyc/B;->b:Ljava/lang/Double;

    .line 31
    .line 32
    iget v1, p0, Lyc/k;->f:I

    .line 33
    .line 34
    invoke-static {v1}, LA/f;->f(I)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    sget-object v2, Lyc/u;->b:Lyc/u;

    .line 39
    .line 40
    const/4 v4, 0x1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    if-eq v1, v4, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    sget-object v2, Lyc/u;->c:Lyc/u;

    .line 47
    .line 48
    :cond_1
    :goto_0
    iget v1, p0, Lyc/k;->g:I

    .line 49
    .line 50
    invoke-static {v1}, LA/f;->f(I)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    sget-object v5, Lyc/w;->b:Lyc/w;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    if-eq v1, v4, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    sget-object v5, Lyc/w;->c:Lyc/w;

    .line 62
    .line 63
    :cond_3
    :goto_1
    new-instance v1, Lyc/s;

    .line 64
    .line 65
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 66
    .line 67
    .line 68
    iput-object v3, v1, Lyc/s;->a:Lyc/B;

    .line 69
    .line 70
    iput-object v2, v1, Lyc/s;->b:Lyc/u;

    .line 71
    .line 72
    iput-object v5, v1, Lyc/s;->c:Lyc/w;

    .line 73
    .line 74
    iget-object v2, p0, Lyc/k;->d:Ljava/lang/Boolean;

    .line 75
    .line 76
    iput-object v2, v1, Lyc/s;->d:Ljava/lang/Boolean;

    .line 77
    .line 78
    iget-object v2, p0, Lyc/k;->e:Ljava/lang/Boolean;

    .line 79
    .line 80
    iput-object v2, v1, Lyc/s;->e:Ljava/lang/Boolean;

    .line 81
    .line 82
    new-instance v2, La2/k;

    .line 83
    .line 84
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 85
    .line 86
    .line 87
    new-instance v3, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    const-string v4, "dev.flutter.pigeon.camera_android.CameraEventApi.initialized"

    .line 90
    .line 91
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iget-object v0, v0, Lmd/J;->c:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Lt6/q;

    .line 97
    .line 98
    iget-object v4, v0, Lt6/q;->b:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v4, Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    new-instance v4, LVa/X7;

    .line 110
    .line 111
    sget-object v5, Lyc/p;->d:Lyc/p;

    .line 112
    .line 113
    const/4 v6, 0x0

    .line 114
    iget-object v0, v0, Lt6/q;->a:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v0, Luc/f;

    .line 117
    .line 118
    invoke-direct {v4, v0, v5, v6, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    new-instance v0, Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 128
    .line 129
    .line 130
    new-instance v1, LJ9/y;

    .line 131
    .line 132
    const/4 v5, 0x6

    .line 133
    invoke-direct {v1, v2, v3, v5}, LJ9/y;-><init>(La2/k;Ljava/lang/String;I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v4, v0, v1}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 137
    .line 138
    .line 139
    return-void
.end method
