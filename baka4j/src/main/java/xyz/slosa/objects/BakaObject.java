package xyz.slosa.objects;

/**
 * @author : slosa
 * @created : 03.11.24, Sunday
 * CC BakalariDesktop's contributors, use according to the license!
 **/
public interface BakaObject {

    default String status() {
        return "No Status";
    }
}
