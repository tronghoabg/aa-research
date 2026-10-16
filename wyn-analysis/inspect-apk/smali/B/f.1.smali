.class public final LB/f;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:Le0/m;

.field public final synthetic j:J

.field public final synthetic k:J

.field public final synthetic l:Lg0/c;


# direct methods
.method public constructor <init>(Le0/m;JJLg0/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LB/f;->i:Le0/m;

    .line 2
    .line 3
    iput-wide p2, p0, LB/f;->j:J

    .line 4
    .line 5
    iput-wide p4, p0, LB/f;->k:J

    .line 6
    .line 7
    iput-object p6, p0, LB/f;->l:Lg0/c;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

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
    iget-object v1, p0, LB/f;->i:Le0/m;

    .line 13
    .line 14
    iget-object v7, p0, LB/f;->l:Lg0/c;

    .line 15
    .line 16
    const/16 v8, 0x68

    .line 17
    .line 18
    iget-wide v2, p0, LB/f;->j:J

    .line 19
    .line 20
    iget-wide v4, p0, LB/f;->k:J

    .line 21
    .line 22
    const/4 v6, 0x0

    .line 23
    invoke-static/range {v0 .. v8}, Lcom/google/android/gms/internal/consent_sdk/a;->f(Lt0/v;Le0/m;JJFLg0/c;I)V

    .line 24
    .line 25
    .line 26
    sget-object p1, Lef/C;->a:Lef/C;

    .line 27
    .line 28
    return-object p1
.end method
