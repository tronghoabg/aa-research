.class public final LB/g;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:Z

.field public final synthetic j:Le0/m;

.field public final synthetic k:J

.field public final synthetic l:F

.field public final synthetic m:F

.field public final synthetic n:J

.field public final synthetic o:J

.field public final synthetic p:Lg0/g;


# direct methods
.method public constructor <init>(ZLe0/m;JFFJJLg0/g;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LB/g;->i:Z

    .line 2
    .line 3
    iput-object p2, p0, LB/g;->j:Le0/m;

    .line 4
    .line 5
    iput-wide p3, p0, LB/g;->k:J

    .line 6
    .line 7
    iput p5, p0, LB/g;->l:F

    .line 8
    .line 9
    iput p6, p0, LB/g;->m:F

    .line 10
    .line 11
    iput-wide p7, p0, LB/g;->n:J

    .line 12
    .line 13
    iput-wide p9, p0, LB/g;->o:J

    .line 14
    .line 15
    iput-object p11, p0, LB/g;->p:Lg0/g;

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lt0/v;

    .line 3
    .line 4
    const-string p1, "$this$onDrawWithContent"

    .line 5
    .line 6
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lt0/v;->a()V

    .line 10
    .line 11
    .line 12
    iget-boolean p1, p0, LB/g;->i:Z

    .line 13
    .line 14
    iget-object v1, p0, LB/g;->j:Le0/m;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const/4 v8, 0x0

    .line 19
    const/16 v9, 0xf6

    .line 20
    .line 21
    const-wide/16 v2, 0x0

    .line 22
    .line 23
    const-wide/16 v4, 0x0

    .line 24
    .line 25
    iget-wide v6, p0, LB/g;->k:J

    .line 26
    .line 27
    invoke-static/range {v0 .. v9}, Lcom/google/android/gms/internal/consent_sdk/a;->h(Lt0/v;Le0/m;JJJLg0/c;I)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-wide v2, p0, LB/g;->k:J

    .line 32
    .line 33
    invoke-static {v2, v3}, Ld0/a;->b(J)F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iget v4, p0, LB/g;->l:F

    .line 38
    .line 39
    cmpg-float p1, p1, v4

    .line 40
    .line 41
    if-gez p1, :cond_1

    .line 42
    .line 43
    iget-object p1, v0, Lt0/v;->a:Lg0/b;

    .line 44
    .line 45
    iget-object v2, p1, Lg0/b;->b:Lba/a;

    .line 46
    .line 47
    invoke-virtual {v2}, Lba/a;->y()J

    .line 48
    .line 49
    .line 50
    move-result-wide v2

    .line 51
    invoke-static {v2, v3}, Ld0/f;->d(J)F

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    iget v3, p0, LB/g;->m:F

    .line 56
    .line 57
    sub-float v7, v2, v3

    .line 58
    .line 59
    iget-object v2, p1, Lg0/b;->b:Lba/a;

    .line 60
    .line 61
    invoke-virtual {v2}, Lba/a;->y()J

    .line 62
    .line 63
    .line 64
    move-result-wide v4

    .line 65
    invoke-static {v4, v5}, Ld0/f;->b(J)F

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    sub-float v8, v2, v3

    .line 70
    .line 71
    iget-object p1, p1, Lg0/b;->b:Lba/a;

    .line 72
    .line 73
    invoke-virtual {p1}, Lba/a;->y()J

    .line 74
    .line 75
    .line 76
    move-result-wide v10

    .line 77
    invoke-virtual {p1}, Lba/a;->v()Le0/o;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-interface {v2}, Le0/o;->m()V

    .line 82
    .line 83
    .line 84
    iget-object v2, p1, Lba/a;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v2, Lad/L;

    .line 87
    .line 88
    iget-object v2, v2, Lad/L;->b:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v2, Lba/a;

    .line 91
    .line 92
    invoke-virtual {v2}, Lba/a;->v()Le0/o;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    iget v5, p0, LB/g;->m:F

    .line 97
    .line 98
    const/4 v9, 0x0

    .line 99
    move v6, v5

    .line 100
    invoke-interface/range {v4 .. v9}, Le0/o;->e(FFFFI)V

    .line 101
    .line 102
    .line 103
    const/4 v8, 0x0

    .line 104
    const/16 v9, 0xf6

    .line 105
    .line 106
    const-wide/16 v2, 0x0

    .line 107
    .line 108
    const-wide/16 v4, 0x0

    .line 109
    .line 110
    iget-wide v6, p0, LB/g;->k:J

    .line 111
    .line 112
    invoke-static/range {v0 .. v9}, Lcom/google/android/gms/internal/consent_sdk/a;->h(Lt0/v;Le0/m;JJJLg0/c;I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, Lba/a;->v()Le0/o;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-interface {v0}, Le0/o;->restore()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1, v10, v11}, Lba/a;->J(J)V

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_1
    invoke-static {v2, v3, v4}, La/a;->K(JF)J

    .line 127
    .line 128
    .line 129
    move-result-wide v6

    .line 130
    iget-object v8, p0, LB/g;->p:Lg0/g;

    .line 131
    .line 132
    const/16 v9, 0xd0

    .line 133
    .line 134
    iget-wide v2, p0, LB/g;->n:J

    .line 135
    .line 136
    iget-wide v4, p0, LB/g;->o:J

    .line 137
    .line 138
    invoke-static/range {v0 .. v9}, Lcom/google/android/gms/internal/consent_sdk/a;->h(Lt0/v;Le0/m;JJJLg0/c;I)V

    .line 139
    .line 140
    .line 141
    :goto_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 142
    .line 143
    return-object p1
.end method
