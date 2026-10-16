.class public final LC8/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:LD8/a;


# instance fields
.field public a:LL8/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LD8/a;

    .line 2
    .line 3
    const-class v1, LC8/l;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v0, v1, v2}, LD8/a;-><init>(Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    sput-object v0, LC8/l;->b:LD8/a;

    .line 14
    .line 15
    return-void
.end method
